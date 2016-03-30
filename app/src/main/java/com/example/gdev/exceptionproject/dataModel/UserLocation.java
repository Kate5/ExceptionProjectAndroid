package com.example.gdev.exceptionproject.dataModel;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class UserLocation
{
  private java.util.Date created;
  private java.util.Date updated;
  private String ownerId;
  private Boolean isPrivate;
  private String objectId;
  private BackendlessUser user;
  private NudgeLocationHistory nudgeHistory;
  private GeoPoint location;
  public java.util.Date getCreated()
  {
    return created;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public Boolean getIsPrivate()
  {
    return isPrivate;
  }

  public void setIsPrivate( Boolean isPrivate )
  {
    this.isPrivate = isPrivate;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public BackendlessUser getUser()
  {
    return user;
  }

  public void setUser( BackendlessUser user )
  {
    this.user = user;
  }

  public NudgeLocationHistory getNudgeHistory()
  {
    return nudgeHistory;
  }

  public void setNudgeHistory( NudgeLocationHistory nudgeHistory )
  {
    this.nudgeHistory = nudgeHistory;
  }

  public GeoPoint getLocation()
  {
    return location;
  }

  public void setLocation( GeoPoint location )
  {
    this.location = location;
  }

                                                    
  public UserLocation save()
  {
    return Backendless.Data.of( UserLocation.class ).save( this );
  }

  public Future<UserLocation> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserLocation> future = new Future<UserLocation>();
      Backendless.Data.of( UserLocation.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<UserLocation> callback )
  {
    Backendless.Data.of( UserLocation.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( UserLocation.class ).remove( this );
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
      Backendless.Data.of( UserLocation.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( UserLocation.class ).remove( this, callback );
  }

  public static UserLocation findById( String id )
  {
    return Backendless.Data.of( UserLocation.class ).findById( id );
  }

  public static Future<UserLocation> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserLocation> future = new Future<UserLocation>();
      Backendless.Data.of( UserLocation.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<UserLocation> callback )
  {
    Backendless.Data.of( UserLocation.class ).findById( id, callback );
  }

  public static UserLocation findFirst()
  {
    return Backendless.Data.of( UserLocation.class ).findFirst();
  }

  public static Future<UserLocation> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserLocation> future = new Future<UserLocation>();
      Backendless.Data.of( UserLocation.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<UserLocation> callback )
  {
    Backendless.Data.of( UserLocation.class ).findFirst( callback );
  }

  public static UserLocation findLast()
  {
    return Backendless.Data.of( UserLocation.class ).findLast();
  }

  public static Future<UserLocation> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserLocation> future = new Future<UserLocation>();
      Backendless.Data.of( UserLocation.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<UserLocation> callback )
  {
    Backendless.Data.of( UserLocation.class ).findLast( callback );
  }

  public static BackendlessCollection<UserLocation> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( UserLocation.class ).find( query );
  }

  public static Future<BackendlessCollection<UserLocation>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<UserLocation>> future = new Future<BackendlessCollection<UserLocation>>();
      Backendless.Data.of( UserLocation.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<UserLocation>> callback )
  {
    Backendless.Data.of( UserLocation.class ).find( query, callback );
  }
}