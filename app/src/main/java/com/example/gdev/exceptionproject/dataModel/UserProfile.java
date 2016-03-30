package com.example.gdev.exceptionproject.dataModel;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.persistence.BackendlessDataQuery;

public class UserProfile
{
  private String eyeColor;
  private java.util.Date dob;
  private String gender;
  private java.util.Date updated;
  private String picture_url;
  private java.util.Date created;
  private String firstName;
  private String hairColor;
  private String lastName;
  private String height;
  private String objectId;
  private String ownerId;
  private String phoneNumber;
  private String email;

  public String getEyeColor()
  {
    return eyeColor;
  }

  public void setEyeColor( String eyeColor )
  {
    this.eyeColor = eyeColor;
  }

  public java.util.Date getDob()
  {
    return dob;
  }

  public void setDob( java.util.Date dob )
  {
    this.dob = dob;
  }

  public String getGender()
  {
    return gender;
  }

  public void setGender( String gender )
  {
    this.gender = gender;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public String getPicture_url()
  {
    return picture_url;
  }

  public void setPicture_url( String picture_url )
  {
    this.picture_url = picture_url;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName( String firstName )
  {
    this.firstName = firstName;
  }

  public String getHairColor()
  {
    return hairColor;
  }

  public void setHairColor( String hairColor )
  {
    this.hairColor = hairColor;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName( String lastName )
  {
    this.lastName = lastName;
  }

  public String getHeight()
  {
    return height;
  }

  public void setHeight( String height )
  {
    this.height = height;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

                                                    
  public UserProfile save()
  {
    return Backendless.Data.of( UserProfile.class ).save( this );
  }

  public Future<UserProfile> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserProfile> future = new Future<UserProfile>();
      Backendless.Data.of( UserProfile.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<UserProfile> callback )
  {
    Backendless.Data.of( UserProfile.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( UserProfile.class ).remove( this );
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
      Backendless.Data.of( UserProfile.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( UserProfile.class ).remove( this, callback );
  }

  public static UserProfile findById( String id )
  {
    return Backendless.Data.of( UserProfile.class ).findById( id );
  }

  public static Future<UserProfile> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserProfile> future = new Future<UserProfile>();
      Backendless.Data.of( UserProfile.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<UserProfile> callback )
  {
    Backendless.Data.of( UserProfile.class ).findById( id, callback );
  }

  public static UserProfile findFirst()
  {
    return Backendless.Data.of( UserProfile.class ).findFirst();
  }

  public static Future<UserProfile> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserProfile> future = new Future<UserProfile>();
      Backendless.Data.of( UserProfile.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<UserProfile> callback )
  {
    Backendless.Data.of( UserProfile.class ).findFirst( callback );
  }

  public static UserProfile findLast()
  {
    return Backendless.Data.of( UserProfile.class ).findLast();
  }

  public static Future<UserProfile> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<UserProfile> future = new Future<UserProfile>();
      Backendless.Data.of( UserProfile.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<UserProfile> callback )
  {
    Backendless.Data.of( UserProfile.class ).findLast( callback );
  }

  public static BackendlessCollection<UserProfile> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( UserProfile.class ).find( query );
  }

  public static Future<BackendlessCollection<UserProfile>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<UserProfile>> future = new Future<BackendlessCollection<UserProfile>>();
      Backendless.Data.of( UserProfile.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<UserProfile>> callback )
  {
    Backendless.Data.of( UserProfile.class ).find( query, callback );
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email){
    this.email = email;
  }
}