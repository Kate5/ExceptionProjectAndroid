package com.example.gdev.exceptionproject.dataModel;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.persistence.BackendlessDataQuery;

public class UserNudge
{
  private java.util.Date created;
  private String ownerId;
  private Integer status;
  private java.util.Date updated;
  private String objectId;
  private BackendlessUser recipient;
  private BackendlessUser sender;
  private Integer notificationStatus;

  public java.util.Date getCreated()
  {
    return created;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public Integer getStatus()
  {
    return status;
  }

  public void setStatus( Integer status )
  {
    this.status = status;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public BackendlessUser getRecipient()
  {
    return recipient;
  }

  public void setRecipient(BackendlessUser recipient)
  {
    this.recipient = recipient;
  }

                                                    
  public UserNudge save()
  {
    return Backendless.Data.of( UserNudge.class ).save( this );
  }

  public Future<UserNudge> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserNudge> future = new Future<UserNudge>();
      Backendless.Data.of( UserNudge.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<UserNudge> callback )
  {
    Backendless.Data.of( UserNudge.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( UserNudge.class ).remove( this );
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
      Backendless.Data.of( UserNudge.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( UserNudge.class ).remove( this, callback );
  }

  public static UserNudge findById( String id )
  {
    return Backendless.Data.of( UserNudge.class ).findById( id );
  }

  public static Future<UserNudge> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserNudge> future = new Future<UserNudge>();
      Backendless.Data.of( UserNudge.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<UserNudge> callback )
  {
    Backendless.Data.of( UserNudge.class ).findById( id, callback );
  }

  public static UserNudge findFirst()
  {
    return Backendless.Data.of( UserNudge.class ).findFirst();
  }

  public static Future<UserNudge> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserNudge> future = new Future<UserNudge>();
      Backendless.Data.of( UserNudge.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<UserNudge> callback )
  {
    Backendless.Data.of( UserNudge.class ).findFirst( callback );
  }

  public static UserNudge findLast()
  {
    return Backendless.Data.of( UserNudge.class ).findLast();
  }

  public static Future<UserNudge> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserNudge> future = new Future<UserNudge>();
      Backendless.Data.of( UserNudge.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<UserNudge> callback )
  {
    Backendless.Data.of( UserNudge.class ).findLast( callback );
  }

  public static BackendlessCollection<UserNudge> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( UserNudge.class ).find( query );
  }

  public static Future<BackendlessCollection<UserNudge>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<UserNudge>> future = new Future<BackendlessCollection<UserNudge>>();
      Backendless.Data.of( UserNudge.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<UserNudge>> callback )
  {
    Backendless.Data.of( UserNudge.class ).find( query, callback );
  }

  public Integer getNotificationStatus() {
    return notificationStatus;
  }

  public void setNotificationStatus(Integer notificationStatus) {
    this.notificationStatus = notificationStatus;
  }

  public BackendlessUser getSender() {
    return sender;
  }

  public void setSender(BackendlessUser sender) {
    this.sender = sender;
  }
}