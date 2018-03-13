# cs160 programming assignment 3

bCourses assignment https://bcourses.berkeley.edu/courses/1469435/assignments/7877915

2. Viewing Landmarks and how far away they are
3. Accessing a landmark message board
3. Posting / retrieving comments from a message board using Firebase

## 1. Breakdown of tasks

## Viewing Landmarks and their locations
### Requirements
- display all landmark images (provided for you), names (provided for you), and distances between the user's last known location in a Recycler View. Location names, coordinates, and filepath are already provided in the file **bear_statues.json** We have already parsed this json file for you.

### Getting the user's current location 
You can locate your user using android's [locationing api's](https://developer.android.com/training/location/index.html). Since these api's are a part of Google Play Services, you will need to run an emulator with Google Play Services already installed (i.e., Nexus 5 or 5x) or install Google Play Services to an existing emulator. 

Here is an example of a simple location tracking app: https://github.com/googlesamples/android-play-location/tree/master/LocationUpdates. You may find it helpful to add the code from this project into your own application to test out location services. 

If you are using a simulator for testing, you can simulate location updates via the Location tab in your simulator's "Extended Controls" menu. Below is a screenshot of what this menu looks like, using a simple location app provided at https://github.com/googlesamples/android-play-location/tree/master/LocationUpdates. 

()[img/tracking_location.png]

You may find the MainActivity file in this repository helpful in implementing location tracking in your own app. Do note that you are not required to continuously track location updates, as is done in this example. For this assignment, you only need to fetch the user's location on button press.
 


## 3. Accessing a landmark message board
### Requirements
- Users should only be able to access a location's message board if they are within 10 feet of that location.

```java
// returns true if location A is less than 10 meters away from location B
Math.round(locationA.distanceTo(locationB)) < 10
```
To present the message board, you will need to use 

```java
String hello = "hello";
Intent goToNewActivityIntent = new Intent(ClassYouAreIn.this, ClassYouWantToGoTo.class);
ClassYouAreIn.this.startActivity(ClassYouWantToGoTo);
```

To pass data through an intent to the next activity, you can use the `putExtra` method.

## 5. Comment Feed Tutorial
TODO: 

