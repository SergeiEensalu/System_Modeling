package net.ulno.fulib;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Collections;
import java.util.Collection;

public class Player
{
   public static final String PROPERTY_isHisTurn = "isHisTurn";
   private boolean isHisTurn;
   protected PropertyChangeSupport listeners;
   public static final String PROPERTY_name = "name";
   private String name;
   public static final String PROPERTY_buckets = "buckets";
   private List<Bucket> buckets;
   public static final String PROPERTY_house = "house";
   private House house;
   private final Integer id;

   public boolean getIsHisTurn()
   {
      return this.isHisTurn;
   }

   public Player() {
      int range = 1000000;
      Random r = new Random();
      this.id = r.nextInt(range);
   }

   public Player setIsHisTurn(boolean value)
   {
      if (value == this.isHisTurn)
      {
         return this;
      }

      final boolean oldValue = this.isHisTurn;
      this.isHisTurn = value;
      this.firePropertyChange(PROPERTY_isHisTurn, oldValue, value);
      return this;
   }

   public boolean firePropertyChange(String propertyName, Object oldValue, Object newValue)
   {
      if (this.listeners != null)
      {
         this.listeners.firePropertyChange(propertyName, oldValue, newValue);
         return true;
      }
      return false;
   }

   public boolean addPropertyChangeListener(PropertyChangeListener listener)
   {
      if (this.listeners == null)
      {
         this.listeners = new PropertyChangeSupport(this);
      }
      this.listeners.addPropertyChangeListener(listener);
      return true;
   }

   public boolean addPropertyChangeListener(String propertyName, PropertyChangeListener listener)
   {
      if (this.listeners == null)
      {
         this.listeners = new PropertyChangeSupport(this);
      }
      this.listeners.addPropertyChangeListener(propertyName, listener);
      return true;
   }

   public boolean removePropertyChangeListener(PropertyChangeListener listener)
   {
      if (this.listeners != null)
      {
         this.listeners.removePropertyChangeListener(listener);
      }
      return true;
   }

   public boolean removePropertyChangeListener(String propertyName, PropertyChangeListener listener)
   {
      if (this.listeners != null)
      {
         this.listeners.removePropertyChangeListener(propertyName, listener);
      }
      return true;
   }

   public void removeYou()
   {
      this.withoutBuckets(new ArrayList<>(this.getBuckets()));
      this.setHouse(null);
   }

   public String getName()
   {
      return this.name;
   }

   public Player setName(String value)
   {
      if (Objects.equals(value, this.name))
      {
         return this;
      }

      final String oldValue = this.name;
      this.name = value;
      this.firePropertyChange(PROPERTY_name, oldValue, value);
      return this;
   }

   @Override
   public String toString()
   {
      final StringBuilder result = new StringBuilder();
      result.append(' ').append(this.getName());
      return result.substring(1);
   }

   public List<Bucket> getBuckets()
   {
      return this.buckets != null ? Collections.unmodifiableList(this.buckets) : Collections.emptyList();
   }

   public Player withBuckets(Bucket value)
   {
      if (this.buckets == null)
      {
         this.buckets = new ArrayList<>();
      }
      if (!this.buckets.contains(value))
      {
         this.buckets.add(value);
         value.setPlayer(this);
         this.firePropertyChange(PROPERTY_buckets, null, value);
      }
      return this;
   }

   public Player withBuckets(Bucket... value)
   {
      for (final Bucket item : value)
      {
         this.withBuckets(item);
      }
      return this;
   }

   public Player withBuckets(Collection<? extends Bucket> value)
   {
      for (final Bucket item : value)
      {
         this.withBuckets(item);
      }
      return this;
   }

   public Player withoutBuckets(Bucket value)
   {
      if (this.buckets != null && this.buckets.remove(value))
      {
         value.setPlayer(null);
         this.firePropertyChange(PROPERTY_buckets, value, null);
      }
      return this;
   }

   public Player withoutBuckets(Bucket... value)
   {
      for (final Bucket item : value)
      {
         this.withoutBuckets(item);
      }
      return this;
   }

   public Player withoutBuckets(Collection<? extends Bucket> value)
   {
      for (final Bucket item : value)
      {
         this.withoutBuckets(item);
      }
      return this;
   }

   public House getHouse()
   {
      return this.house;
   }

   public Player setHouse(House value)
   {
      if (this.house == value)
      {
         return this;
      }

      final House oldValue = this.house;
      if (this.house != null)
      {
         this.house = null;
         oldValue.setPlayer(null);
      }
      this.house = value;
      if (value != null)
      {
         value.setPlayer(this);
      }
      this.firePropertyChange(PROPERTY_house, oldValue, value);
      return this;
   }

   public Integer getId() {
      return id;
   }

}
