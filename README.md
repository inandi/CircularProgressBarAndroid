# Circular Progress Bar - Android (XML & Custom View)

A simple **Circular Progress Bar** built using **Android Custom View & Canvas**. Supports dynamic progress updates with **percentage text in the center**.  

## Features  
✅ Custom circular progress bar using `Canvas` & `Paint`  
✅ Displays percentage inside the circle  
✅ Dynamically updates progress with a button click  
✅ Smooth rendering with `invalidate()`  

## Screenshots  
*(Add a screenshot of the circular progress bar here!)*  

## Setup & Usage  

### 1. Add the Custom View (`CircularProgressBar.kt`)  
Create a custom view to draw the progress circle and text inside.  

```kotlin
class CircularProgressBar(context: Context, attrs: AttributeSet?) : View(context, attrs) {
    // Custom paint styles & progress handling
}
```

### 2. Use in XML (`activity_main.xml`)  
```xml
<com.example.circularprogressbar.CircularProgressBar
    android:id="@+id/circularProgressBar"
    android:layout_width="200dp"
    android:layout_height="200dp" />
```

### 3. Control Progress in `MainActivity.kt`  
```kotlin
var progress = 0f
btnIncreaseProgress.setOnClickListener {
    progress += 0.1f
    if (progress > 1f) progress = 0f
    circularProgressBar.setProgress(progress)
}
```

## How to Run  
1. Clone or download this repository.  
2. Open in **Android Studio**.  
3. Run the app on an **Android device or emulator**.  
4. Click **"Increase Progress"** to see the progress update.  

## Customization  
- Change **progress color** in `progressPaint.color`.  
- Adjust **stroke thickness** via `strokeWidth`.  
- Modify **text size** in `textPaint.textSize`.  

## License  
This project is **free to use** and modify! 🎨

