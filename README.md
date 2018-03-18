# cs160 prog3 implementation details

bCourses assignment https://bcourses.berkeley.edu/courses/1469435/assignments/7877915

starter code: https://github.com/cs160-spring2018/prog3-starter

1. Viewing Landmarks and how far away they are
2. Accessing a landmark message board
3. Posting / retrieving comments from a message board using Firebase

## Viewing Landmarks and their locations
### Requirements
- display a recycler view with a cell for each landmark in [bear_statues.json](https://github.com/cs160-spring2018/cs160-proj3-spec/blob/master/bear_statue_data/bear_statues.json). Each cell should contain:
   - the landmark name 
   - the landmark image: use the [bear_images](https://github.com/cs160-spring2018/cs160-proj3-spec/tree/master/bear_statue_data/bear_images) included in the starter code
   - the distance between that landmark and your user's last updated location
- an "update location" button. when pressed, you should fetch the user's location and update each of the landmark's distances

### Getting the user's current location 
You can locate your user using android's [locationing api's](https://developer.android.com/training/location/index.html). Since these api's are a part of Google Play Services, you will need to run an emulator with Google Play Services already installed (i.e., Nexus 5 or 5x) or install Google Play Services to an existing emulator. 

#### Tips:
- use the starter code for the message board portion of the app as an example of how to create a recylcer view, adapter, and custom cells
- Here is an example of a simple location tracking app: https://github.com/googlesamples/android-play-location/tree/master/LocationUpdates. You may find it helpful to add the code from MainActivity file into your own app to test out location services. Do note that you are not required to continuously track location updates, as is done in this example.
- If you are using a simulator for testing, you can simulate location updates via the Location tab in your simulator's "Extended Controls" menu. Below is a screenshot of what this menu looks like, using a simple location app provided at https://github.com/googlesamples/android-play-location/tree/master/LocationUpdates. 

![making location updates via the simulator](/tracking_location.png)

## Accessing a landmark message board
### Requirements
- Users should only be able to access a location's message board if they are within 10 feet of that location.

```java
// returns true if location A is less than 10 meters away from location B
Math.round(locationA.distanceTo(locationB)) < 10
```
To present the message board, you will need to use an Intent

```java
String hello = "hello";
Intent goToNewActivityIntent = new Intent(ClassYouAreIn.this, ClassYouWantToGoTo.class);
ClassYouAreIn.this.startActivity(ClassYouWantToGoTo);
```

To pass data through an intent to the next activity, you can use the `putExtra` method.

## Creating the message board

We have provided starter code for this part of the assignment:
- Comment model file: 
- layout files: https://gist.github.com/paigeplan/a5f053be11d2c8424beb3a3e2f0f4da2
- activity file:
- recylcer view adapter: 

You will need to:
- link this provided comment feed to a database

### Linking the message board to a database
We recommend you use the Firebase Realtime Database for this assignment, since it is built into Android Studio.

Android Studio walks you through most of the process of setting up the database, but here is guide on setting up and reading and writing to your database: https://github.com/cs160-spring2018/cs160-proj3-spec/blob/master/firebase_guide.md


