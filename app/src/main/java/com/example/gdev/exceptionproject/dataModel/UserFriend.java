package com.example.gdev.exceptionproject.dataModel;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.persistence.BackendlessDataQuery;

public class UserFriend
{
  private String objectId;
  private String ownerId;
  private String talkPointPurchase;
  private java.util.Date created;
  private java.util.Date updated;
  private BackendlessUser friend;
  public String getObjectId()
  {
    return objectId;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public String getTalkPointPurchase()
  {
    return talkPointPurchase;
  }

  public void setTalkPointPurchase( String talkPointPurchase )
  {
    this.talkPointPurchase = talkPointPurchase;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public BackendlessUser getFriend()
  {
    return friend;
  }

  public void setFriend(BackendlessUser friend)
  {
    this.friend = friend;
  }

                                                    
  public UserFriend save()
  {
    return Backendless.Data.of( UserFriend.class ).save( this );
  }

  public Future<UserFriend> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserFriend> future = new Future<UserFriend>();
      Backendless.Data.of( UserFriend.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<UserFriend> callback )
  {
    Backendless.Data.of( UserFriend.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( UserFriend.class ).remove( this );
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
      Backendless.Data.of( UserFriend.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( UserFriend.class ).remove( this, callback );
  }

  public static UserFriend findById( String id )
  {
    return Backendless.Data.of( UserFriend.class ).findById( id );
  }

  public static Future<UserFriend> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserFriend> future = new Future<UserFriend>();
      Backendless.Data.of( UserFriend.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<UserFriend> callback )
  {
    Backendless.Data.of( UserFriend.class ).findById( id, callback );
  }

  public static UserFriend findFirst()
  {
    return Backendless.Data.of( UserFriend.class ).findFirst();
  }

  public static Future<UserFriend> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserFriend> future = new Future<UserFriend>();
      Backendless.Data.of( UserFriend.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<UserFriend> callback )
  {
    Backendless.Data.of( UserFriend.class ).findFirst( callback );
  }

  public static UserFriend findLast()
  {
    return Backendless.Data.of( UserFriend.class ).findLast();
  }

  public static Future<UserFriend> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserFriend> future = new Future<UserFriend>();
      Backendless.Data.of( UserFriend.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<UserFriend> callback )
  {
    Backendless.Data.of( UserFriend.class ).findLast( callback );
  }

  public static BackendlessCollection<UserFriend> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( UserFriend.class ).find( query );
  }

  public static Future<BackendlessCollection<UserFriend>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<UserFriend>> future = new Future<BackendlessCollection<UserFriend>>();
      Backendless.Data.of( UserFriend.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<UserFriend>> callback )
  {
    Backendless.Data.of( UserFriend.class ).find( query, callback );
  }
}