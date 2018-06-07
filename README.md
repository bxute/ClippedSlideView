## ClippedSlideView [![](https://jitpack.io/v/bxute/ClippedSlideView.svg)](https://jitpack.io/#bxute/ClippedSlideView)

This is a small library for SlideView. It slides a set of views in a clipped circle.
Effect like this can be used in onboarding pages, user profile stories etc. 
Take a sample use of this.

<img src="https://user-images.githubusercontent.com/10809719/41021787-4bcac528-6985-11e8-9619-54f1da4ba052.gif" width="360px" height="640px">

### How to use this library


1.Add Module dependency in `app/build.gradle` file
```
		dependencies {
    	        implementation 'com.github.bxute:ClippedSlideView:v1.0'
    	}

```

2.Add this XML to your activity
```xml
<xute.clippedslideview.ClippedSlideView
        android:id="@+id/clippedSlideView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
```

And you are good to go!

### How to send slide events

`ClippedSlideView` class is has 2 helper methods to slide your view `left` and `right`
A sample usage of this is:
```java
 BottomToolbar bottomToolbar = findViewById(R.id.bottom_toolbar);
        bottomToolbar.setButtonClickListener(new BottomToolbar.ButtonClickListener() {
            @Override
            public void onPlusButtonClicked() {
                Toast.makeText(MainActivity.this,"Button clicked!",Toast.LENGTH_LONG).show();
            }
        });
```

### Contributions

Any contributions are welcome. You can send PR or open issues.

### License
MIT License

Copyright (c) 2018 bxute

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
