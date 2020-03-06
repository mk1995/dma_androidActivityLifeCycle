# dma_androidActivityLifeCycle
This app helps to understand the different activity life cycle of an android sytem.
To navigate transitions between stages of the activity lifecycle, the Activity class provides a core set of six callbacks: onCreate(), onStart(), onResume(), onPause(), onStop(), and onDestroy(). The system invokes each of these callbacks as an activity enters a new state.
[![Main Activity](https://github.com/mk1995/dma_androidActivityLifeCycle/blob/master/mainActivity.png "Main Activity")](https:https://github.com/mk1995/dma_androidActivityLifeCycle/blob/master/Android-Activity-Lifecycle.png "Android-Activity-Lifecycle") 

Method	Description
onCreate	called when activity is first created.
onStart	called when activity is becoming visible to the user.
onResume	called when activity will start interacting with the user.
onPause	called when activity is not visible to the user.
onStop	called when activity is no longer visible to the user.
onRestart	called after your activity is stopped, prior to start.
onDestroy	called before the activity is destroyed

[![Main Activity](https://github.com/mk1995/dma_androidActivityLifeCycle/blob/master/activityLifCyle.png "activityLifCyle")](https://github.com/mk1995/dma_androidActivityLifeCycle/blob/master/activityLifCyle.png"activityLifCyle iN LOGCAT") 


