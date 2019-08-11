# DialogAnimationLibrery
This is a dialogu library with GIF animation

[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=21)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![](https://jitpack.io/v/betojsc/DialogAnimationLibrery.svg)](https://jitpack.io/#betojsc/DialogAnimationLibrery)

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```
## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	implementation 'com.github.betojsc:DialogAnimationLibrery:1.0.1'
}
```
## DialogAnimationLibrery
Dialog with two buttons:
``` java
new GifDialog.Builder(getActivity())
                .setTitle("They have a connection!! ")
                .setColorTitle("#000000")
                .setMessage("this is a message for everyone")
                .setMessageColor("#000000")
                .setPositiveBtnBackground("#E64C008F")
                .setPositiveBtnText("Ok")
                 .setNegativeBtnBackground("33FFFFFF")
                .setNegativeBtnText("Cancel")
                .setGifResource(R.drawable.gif1)
                .setFont(typeface)
                .isCancellable(true)
                .OnPositiveClicked(() -> Toast.makeText(getActivity(), "Ok",
                        Toast.LENGTH_SHORT)
                        .show())
                .OnNegativeClicked(() -> Toast.makeText(getActivity(), "Cancel",
                        Toast.LENGTH_SHORT)
                        .show())
                .build();

```
Dialog with one button:

``` java
 new GifDialog.Builder(getActivity())
                .setTitle("They have a connection!! ")
                .setColorTitle("#000000")
                .setMessage("this is a message for everyone")
                .setMessageColor("#000000")
                .setPositiveBtnBackground("#E64C008F")
                .setPositiveBtnText("Ok")
                .setGifResource(R.drawable.gif1)
                .setFont(typeface)
                .isCancellable(true)
                .OnPositiveClicked(() -> Toast.makeText(getActivity(), "Ok",
                        Toast.LENGTH_SHORT)
                        .show())
                .OnNegativeClicked(() -> Toast.makeText(getActivity(), "Cancel",
                        Toast.LENGTH_SHORT)
                        .show())
                .build();
```

## Basic usages

| Method | Description |
| :---- | :---- |
| setTitle(String) | The main title of the dialog |
| setColorTitle(String) | color text title |
| .setMessage(String) | dialog message |
| setMessageColor(String) | color text message |
| .setPositiveBtnText(String) | text of the positive button |
| .setPositiveBtnBackground(String) | positive button background color |
| .setNegativeBtnText(String) | text of the negative button |
| .setNegativeBtnBackground(String) | negative button background color |
| .setGifResource(Drawable) | gif image to use in the dialog |
| .setFont(Typeface) | font to use throughout the dialog |
| .isCancellable(boolean) | if it is canceled by the user when touching outside the dialog |
| .OnPositiveClicked(GifDialogListener()) | positive button action |
| .OnNegativeClicked(GifDialogListener()) | negative button action |

## Dependencies

This project use this libraries ~ Thanks to them.

  [android-gif-drawable](https://github.com/koral--/android-gif-drawable)
  
  ## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2018 Shashank Singhal

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
