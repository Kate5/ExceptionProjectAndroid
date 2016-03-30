package com.example.gdev.exceptionproject.dataModel;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.persistence.BackendlessDataQuery;

public class TalkCategory
{
  private java.util.Date created;
  private String objectId;
  private java.util.Date updated;
  private String ownerId;
  private String category;
  public java.util.Date getCreated()
  {
    return created;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public String getCategory()
  {
    return category;
  }

  public void setCategory( String category )
  {
    this.category = category;
  }

                                                    
  public TalkCategory save()
  {
    return Backendless.Data.of( TalkCategory.class ).save( this );
  }

  public Future<TalkCategory> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<TalkCategory> future = new Future<TalkCategory>();
      Backendless.Data.of( TalkCategory.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<TalkCategory> callback )
  {
    Backendless.Data.of( TalkCategory.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( TalkCategory.class ).remove( this );
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
      Backendless.Data.of( TalkCategory.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( TalkCategory.class ).remove( this, callback );
  }

  public static TalkCategory findById( String id )
  {
    return Backendless.Data.of( TalkCategory.class ).findById( id );
  }

  public static Future<TalkCategory> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<TalkCategory> future = new Future<TalkCategory>();
      Backendless.Data.of( TalkCategory.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<TalkCategory> callback )
  {
    Backendless.Data.of( TalkCategory.class ).findById( id, callback );
  }

  public static TalkCategory findFirst()
  {
    return Backendless.Data.of( TalkCategory.class ).findFirst();
  }

  public static Future<TalkCategory> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<TalkCategory> future = new Future<TalkCategory>();
      Backendless.Data.of( TalkCategory.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<TalkCategory> callback )
  {
    Backendless.Data.of( TalkCategory.class ).findFirst( callback );
  }

  public static TalkCategory findLast()
  {
    return Backendless.Data.of( TalkCategory.class ).findLast();
  }

  public static Future<TalkCategory> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<TalkCategory> future = new Future<TalkCategory>();
      Backendless.Data.of( TalkCategory.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<TalkCategory> callback )
  {
    Backendless.Data.of( TalkCategory.class ).findLast( callback );
  }

  public static BackendlessCollection<TalkCategory> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( TalkCategory.class ).find( query );
  }

  public static Future<BackendlessCollection<TalkCategory>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<TalkCategory>> future = new Future<BackendlessCollection<TalkCategory>>();
      Backendless.Data.of( TalkCategory.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<TalkCategory>> callback )
  {
    Backendless.Data.of( TalkCategory.class ).find( query, callback );
  }
}