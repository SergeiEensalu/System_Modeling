package net.ulno.fulib;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

public class House
{
   public static final String PROPERTY_pebbleCount = "pebbleCount";
   private int pebbleCount;
   protected PropertyChangeSupport listeners;
   public static final String PROPERTY_player = "player";
   private Player player;

   public int getPebbleCount()
   {
      return this.pebbleCount;
   }

   public House setPebbleCount(int value)
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

   public Player getPlayer()
   {
      return this.player;
   }

   public House setPlayer(Player value)
   {
      if (this.player == value)
      {
         return this;
      }

      final Player oldValue = this.player;
      if (this.player != null)
      {
         this.player = null;
         oldValue.setHouse(null);
      }
      this.player = value;
      if (value != null)
      {
         value.setHouse(this);
      }
      this.firePropertyChange(PROPERTY_player, oldValue, value);
      return this;
   }
}
