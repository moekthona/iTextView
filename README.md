# iTextView
iTextView is library that can custom font on TextView

## Installation

### Step 1

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
 ```

### Step 2
```
dependencies {
	implementation 'com.github.moekthona:iTextView:0.0.2'
}
 ```
# Usage

#### Create Folder

- first folder assets -> create ->folder fonts -> add your font

#### XML code 
```xml
        <com.mtn.itextview.iTextView
            xmlns:app="http://schemas.android.com/apk/res-auto"
            app:fontName="fonts/KhmerFont.ttf"
            android:text="Text"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />

```
