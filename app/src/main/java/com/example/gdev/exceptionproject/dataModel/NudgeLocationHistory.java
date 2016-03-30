package com.example.gdev.exceptionproject.dataModel;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class NudgeLocationHistory
{
  private java.util.Date updated;
  private String objectId;
  private java.util.Date created;
  private String ownerId;
  private java.util.List<UserNudge> nudgeHistory;
  private GeoPoint historyLocation;
  public java.util.Date getUpdated()
  {
    return updated;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public java.util.List<UserNudge> getNudgeHistory()
  {
    return nudgeHistory;
  }

  public void setNudgeHistory( java.util.List<UserNudge> nudgeHistory )
  {
    this.nudgeHistory = nudgeHistory;
  }

  public GeoPoint getHistoryLocation()
  {
    return historyLocation;
  }

  public void setHistoryLocation( GeoPoint historyLocation )
  {
    this.historyLocation = historyLocation;
  }

                                                    
  public NudgeLocationHistory save()
  {
    return Backendless.Data.of( NudgeLocationHistory.class ).save( this );
  }

  public Future<NudgeLocationHistory> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<NudgeLocationHistory> future = new Future<NudgeLocationHistory>();
      Backendless.Data.of( NudgeLocationHistory.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<NudgeLocationHistory> callback )
  {
    Backendless.Data.of( NudgeLocationHistory.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( NudgeLocationHistory.class ).remove( this );
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
      Backendless.Data.of( NudgeLocationHistory.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( NudgeLocationHistory.class ).remove( this, callback );
  }

  public static NudgeLocationHistory findById( String id )
  {
    return Backendless.Data.of( NudgeLocationHistory.class ).findById( id );
  }

  public static Future<NudgeLocationHistory> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<NudgeLocationHistory> future = new Future<NudgeLocationHistory>();
      Backendless.Data.of( NudgeLocationHistory.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<NudgeLocationHistory> callback )
  {
    Backendless.Data.of( NudgeLocationHistory.class ).findById( id, callback );
  }

  public static NudgeLocationHistory findFirst()
  {
    return Backendless.Data.of( NudgeLocationHistory.class ).findFirst();
  }

  public static Future<NudgeLocationHistory> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<NudgeLocationHistory> future = new Future<NudgeLocationHistory>();
      Backendless.Data.of( NudgeLocationHistory.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<NudgeLocationHistory> callback )
  {
    Backendless.Data.of( NudgeLocationHistory.class ).findFirst( callback );
  }

  public static NudgeLocationHistory findLast()
  {
    return Backendless.Data.of( NudgeLocationHistory.class ).findLast();
  }

  public static Future<NudgeLocationHistory> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<NudgeLocationHistory> future = new Future<NudgeLocationHistory>();
      Backendless.Data.of( NudgeLocationHistory.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<NudgeLocationHistory> callback )
  {
    Backendless.Data.of( NudgeLocationHistory.class ).findLast( callback );
  }

  public static BackendlessCollection<NudgeLocationHistory> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( NudgeLocationHistory.class ).find( query );
  }

  public static Future<BackendlessCollection<NudgeLocationHistory>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<NudgeLocationHistory>> future = new Future<BackendlessCollection<NudgeLocationHistory>>();
      Backendless.Data.of( NudgeLocationHistory.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<NudgeLocationHistory>> callback )
  {
    Backendless.Data.of( NudgeLocationHistory.class ).find( query, callback );
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }
}