package com.example.gdev.exceptionproject.dataModel;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.persistence.BackendlessDataQuery;

public class UserNotification
{
  private java.util.Date updated;
  private String userId;
  private String ownerId;
  private java.util.Date created;
  private String objectId;
  private String message;

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public String getUserId()
  {
    return userId;
  }

  public void setUserId(String userId)
  {
    this.userId = userId;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public String getObjectId()
  {
    return objectId;
  }

                                                    
  public UserNotification save()
  {
    return Backendless.Data.of( UserNotification.class ).save( this );
  }

  public Future<UserNotification> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserNotification> future = new Future<UserNotification>();
      Backendless.Data.of( UserNotification.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<UserNotification> callback )
  {
    Backendless.Data.of( UserNotification.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( UserNotification.class ).remove( this );
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
      Backendless.Data.of( UserNotification.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( UserNotification.class ).remove( this, callback );
  }

  public static UserNotification findById( String id )
  {
    return Backendless.Data.of( UserNotification.class ).findById( id );
  }

  public static Future<UserNotification> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserNotification> future = new Future<UserNotification>();
      Backendless.Data.of( UserNotification.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<UserNotification> callback )
  {
    Backendless.Data.of( UserNotification.class ).findById( id, callback );
  }

  public static UserNotification findFirst()
  {
    return Backendless.Data.of( UserNotification.class ).findFirst();
  }

  public static Future<UserNotification> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserNotification> future = new Future<UserNotification>();
      Backendless.Data.of( UserNotification.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<UserNotification> callback )
  {
    Backendless.Data.of( UserNotification.class ).findFirst( callback );
  }

  public static UserNotification findLast()
  {
    return Backendless.Data.of( UserNotification.class ).findLast();
  }

  public static Future<UserNotification> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserNotification> future = new Future<UserNotification>();
      Backendless.Data.of( UserNotification.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<UserNotification> callback )
  {
    Backendless.Data.of( UserNotification.class ).findLast( callback );
  }

  public static BackendlessCollection<UserNotification> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( UserNotification.class ).find( query );
  }

  public static Future<BackendlessCollection<UserNotification>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<UserNotification>> future = new Future<BackendlessCollection<UserNotification>>();
      Backendless.Data.of( UserNotification.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<UserNotification>> callback )
  {
    Backendless.Data.of( UserNotification.class ).find( query, callback );
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}