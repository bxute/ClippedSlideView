## ClippedSlideView [![](https://jitpack.io/v/bxute/ClippedSlideView.svg)](https://jitpack.io/#bxute/ClippedSlideView)

This is a small library for SlideView. It slides a set of views in a clipped circle.
Effect like this can be used in onboarding pages, user profile stories etc. 
Take a sample use of this.

<img src="https://user-images.githubusercontent.com/10809719/41112480-bb230436-6a9c-11e8-8f0d-655bdaf6966e.gif" width="360px" height="640px">

### How to use this library

1. Add the JitPack repository to your build file(project level)
 ```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

2.Add Module dependency in `app/build.gradle` file
```
dependencies
{
    implementation 'com.github.bxute:ClippedSlideView:v1.0'
}

```

3.Add this XML to your activity
```xml
<xute.clippedslideview.ClippedSlideView
        android:id="@+id/clippedSlideView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
```
4. Add some image resource
```java
 clippedSlideView = findViewById(R.id.clippedSlideView);
 int[] ids = new int[]{R.drawable.rose,R.drawable.lily,R.drawable.rainbow};
 clippedSlideView.setImageResource(ids);
```

Now you need to command this view when you want to slide to next item.
So you can call helper method like:
```java
clippedSlideView.slideRight();
//clippedSlideView.slideLeft();
```

### Additional
You can also listen to events when the slider reaches its end.
Just call `.setSlideListener` method and pass the implementation `ClippedSlideView.SlideListener` interface.

```java
 clippedSlideView.setSlideListener(new ClippedSlideView.SlideListener() {
            @Override
            public void onReachedFirst() {
                Toast.makeText(MainActivity.this,"Reached 1st Position!",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onReachedLast() {
                Toast.makeText(MainActivity.this,"Reached last Position!",Toast.LENGTH_LONG).show();
            }
        });
```

You can set the color of Concentric circles by:
```java
    clippedSlideView.setColor(Color.parseColor("#009988"));
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
