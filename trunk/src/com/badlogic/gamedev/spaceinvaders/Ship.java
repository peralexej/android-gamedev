package com.badlogic.gamedev.spaceinvaders;

public class Ship 
{
	public static final float SHIP_VELOCITY = 20;
	public final Vector position = new Vector( );
	int lives = 3;
	public boolean isExploding = false;
	public float explodeTime = 0;
	
	public void update( float delta )
	{
		if( isExploding )
		{
			explodeTime += delta;
			if( explodeTime > 1 )
			{
				isExploding = false;
				explodeTime = 0;
			}
		}
	}
}
