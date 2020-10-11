package net.ulno.fulib;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

public class Bucket
{
   public static final String PROPERTY_pebbleCount = "pebbleCount";
   private int pebbleCount;
   protected PropertyChangeSupport listeners;
   public static final String PROPERTY_id = "id";
   private int id;
   public static final String PROPERTY_player = "player";
   private Player player;

   public int getPebbleCount()
   {
      return this.pebbleCount;
   }

   public Bucket setPebbleCount(int value)
   {
      if (value == this.pebbleCount)
      {
         return this;
      }

      final int oldValue = this.pebbleCount;
      this.pebbleCount = value;
      this.firePropertyChange(PROPERTY_pebbleCount, oldValue, value);
      return this;
   }

   public Bucket withPebbleCount(int value) {
      return setPebbleCount(value);
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
      this.setPlayer(null);
   }

   public int getId()
   {
      return this.id;
   }

   public Bucket setId(int value)
   {
      if (value == this.id)
      {
         return this;
      }

      final int oldValue = this.id;
      this.id = value;
      this.firePropertyChange(PROPERTY_id, oldValue, value);
      return this;
   }

   public Player getPlayer()
   {
      return this.player;
   }

   public Bucket setPlayer(Player value)
   {
      if (this.player == value)
      {
         return this;
      }

      final Player oldValue = this.player;
      if (this.player != null)
      {
         this.player = null;
         oldValue.withoutBuckets(this);
      }
      this.player = value;
      if (value != null)
      {
         value.withBuckets(this);
      }
      this.firePropertyChange(PROPERTY_player, oldValue, value);
      return this;
   }
}
