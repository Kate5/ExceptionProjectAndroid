package com.example.gdev.exceptionproject.dataModel;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.persistence.BackendlessDataQuery;

public class UserTalkPoint
{
  private String category;
  private java.util.Date updated;
  private String objectId;
  private String description;
  private String ownerId;
  private java.util.Date created;
  private Double rating;
  public String getCategory()
  {
    return category;
  }

  public void setCategory( String category )
  {
    this.category = category;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription( String description )
  {
    this.description = description;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public Double getRating()
  {
    return rating;
  }

  public void setRating( Double rating )
  {
    this.rating = rating;
  }

                                                    
  public UserTalkPoint save()
  {
    return Backendless.Data.of( UserTalkPoint.class ).save( this );
  }

  public Future<UserTalkPoint> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserTalkPoint> future = new Future<UserTalkPoint>();
      Backendless.Data.of( UserTalkPoint.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<UserTalkPoint> callback )
  {
    Backendless.Data.of( UserTalkPoint.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( UserTalkPoint.class ).remove( this );
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
      Backendless.Data.of( UserTalkPoint.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( UserTalkPoint.class ).remove( this, callback );
  }

  public static UserTalkPoint findById( String id )
  {
    return Backendless.Data.of( UserTalkPoint.class ).findById( id );
  }

  public static Future<UserTalkPoint> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserTalkPoint> future = new Future<UserTalkPoint>();
      Backendless.Data.of( UserTalkPoint.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<UserTalkPoint> callback )
  {
    Backendless.Data.of( UserTalkPoint.class ).findById( id, callback );
  }

  public static UserTalkPoint findFirst()
  {
    return Backendless.Data.of( UserTalkPoint.class ).findFirst();
  }

  public static Future<UserTalkPoint> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserTalkPoint> future = new Future<UserTalkPoint>();
      Backendless.Data.of( UserTalkPoint.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<UserTalkPoint> callback )
  {
    Backendless.Data.of( UserTalkPoint.class ).findFirst( callback );
  }

  public static UserTalkPoint findLast()
  {
    return Backendless.Data.of( UserTalkPoint.class ).findLast();
  }

  public static Future<UserTalkPoint> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserTalkPoint> future = new Future<UserTalkPoint>();
      Backendless.Data.of( UserTalkPoint.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<UserTalkPoint> callback )
  {
    Backendless.Data.of( UserTalkPoint.class ).findLast( callback );
  }

  public static BackendlessCollection<UserTalkPoint> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( UserTalkPoint.class ).find( query );
  }

  public static Future<BackendlessCollection<UserTalkPoint>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<UserTalkPoint>> future = new Future<BackendlessCollection<UserTalkPoint>>();
      Backendless.Data.of( UserTalkPoint.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<UserTalkPoint>> callback )
  {
    Backendless.Data.of( UserTalkPoint.class ).find( query, callback );
  }


}