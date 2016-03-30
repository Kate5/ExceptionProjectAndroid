package com.example.gdev.exceptionproject.dataModel;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.persistence.BackendlessDataQuery;

public class UserMatchProfile
{
  private String gender;
  private String hairColor;
  private String objectId;
  private String ownerId;
  private java.util.Date updated;
  private java.util.Date created;
  private String eyeColor;
  private String height;
  public String getGender()
  {
    return gender;
  }

  public void setGender( String gender )
  {
    this.gender = gender;
  }

  public String getHairColor()
  {
    return hairColor;
  }

  public void setHairColor( String hairColor )
  {
    this.hairColor = hairColor;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public String getEyeColor()
  {
    return eyeColor;
  }

  public void setEyeColor( String eyeColor )
  {
    this.eyeColor = eyeColor;
  }

  public String getHeight()
  {
    return height;
  }

  public void setHeight( String height )
  {
    this.height = height;
  }

                                                    
  public UserMatchProfile save()
  {
    return Backendless.Data.of( UserMatchProfile.class ).save( this );
  }

  public Future<UserMatchProfile> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserMatchProfile> future = new Future<UserMatchProfile>();
      Backendless.Data.of( UserMatchProfile.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<UserMatchProfile> callback )
  {
    Backendless.Data.of( UserMatchProfile.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( UserMatchProfile.class ).remove( this );
  }

  public Future<Long> removeAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Long> future = new Future<Long>();
      Backendless.Data.of( UserMatchProfile.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( UserMatchProfile.class ).remove( this, callback );
  }

  public static UserMatchProfile findById( String id )
  {
    return Backendless.Data.of( UserMatchProfile.class ).findById( id );
  }

  public static Future<UserMatchProfile> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserMatchProfile> future = new Future<UserMatchProfile>();
      Backendless.Data.of( UserMatchProfile.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<UserMatchProfile> callback )
  {
    Backendless.Data.of( UserMatchProfile.class ).findById( id, callback );
  }

  public static UserMatchProfile findFirst()
  {
    return Backendless.Data.of( UserMatchProfile.class ).findFirst();
  }

  public static Future<UserMatchProfile> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserMatchProfile> future = new Future<UserMatchProfile>();
      Backendless.Data.of( UserMatchProfile.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<UserMatchProfile> callback )
  {
    Backendless.Data.of( UserMatchProfile.class ).findFirst( callback );
  }

  public static UserMatchProfile findLast()
  {
    return Backendless.Data.of( UserMatchProfile.class ).findLast();
  }

  public static Future<UserMatchProfile> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserMatchProfile> future = new Future<UserMatchProfile>();
      Backendless.Data.of( UserMatchProfile.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<UserMatchProfile> callback )
  {
    Backendless.Data.of( UserMatchProfile.class ).findLast( callback );
  }

  public static BackendlessCollection<UserMatchProfile> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( UserMatchProfile.class ).find( query );
  }

  public static Future<BackendlessCollection<UserMatchProfile>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<UserMatchProfile>> future = new Future<BackendlessCollection<UserMatchProfile>>();
      Backendless.Data.of( UserMatchProfile.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<UserMatchProfile>> callback )
  {
    Backendless.Data.of( UserMatchProfile.class ).find( query, callback );
  }
}