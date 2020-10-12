package net.ulno.fulib;

import org.fulib.builder.ClassModelDecorator;
import org.fulib.builder.ClassModelManager;
import org.fulib.builder.Type;
import org.fulib.classmodel.Clazz;

public class GenModel implements ClassModelDecorator
{
	@Override
	public void decorate(ClassModelManager mm)
	{
		final Clazz player = mm.haveClass("Player", c -> {
			c.attribute("name", Type.STRING);
			c.attribute("isHisTurn", Type.BOOLEAN);
		});

		final Clazz bucket = mm.haveClass("Bucket", c -> {
			c.attribute("id", Type.INT);
			c.attribute("pebbleCount", Type.INT);
		});

		final Clazz house = mm.haveClass("House", c -> {
			c.attribute("pebbleCount", Type.INT);
		});

		// a player has many buckets, buckets have one player
		mm.associate(bucket, "player", Type.ONE, player, "buckets", Type.MANY);

		// a player has one house, a house has one player
		mm.associate(house, "player", Type.ONE, player, "house", Type.ONE);

	}
}
