[![Java programming language](https://img.shields.io/badge/language-Java-bf7b3b.svg)](http://www.oracle.com/technetwork/java/index.html "Java programming language")
[![MIT License](https://img.shields.io/badge/license-MIT-1e90ff.svg)](MIT-LICENSE.md "MIT License")

# Alphabetik

<snippet>
  <content><![CDATA[
# ${1:Project Name}

This project allows you to put an "Alphabet Section Index" beside your "ListView/RecyclerView" or any other "ScrollViewList" on your app. It is easy to use!. This is alike "Section Index" for iOS.
<img src="https://github.com/richimf/Alphabetik/blob/master/Screenshot.png" width="350">

## Features
- Alphabet bar in a side of the screen, this bar can be edited as a RecyclerView, so feel free to customize it :)
- Methods:
<br>**onSectionIndexClickListener( )** launches when user clicks on a letter.
<br>**setAlphabet( )** developer can set up a custom alphabet.
<br>**setLetterToBold( )** you can change letter typeface to bold.

## Usage
Implement in your **Activity** as follows: 
```Java
Alphabetik alphabetik = (Alphabetik) findViewById(R.id.alphSectionIndex);
        alphabetik.onSectionIndexClickListener(new Alphabetik.SectionIndexClickListener() {
            @Override
            public void onItemClick(View view, int position, String character) {
                String info = " Position = " + position + " Char = " + character;
                Log.i("View: ", view + "," + info);
                //Toast.makeText(getBaseContext(), info, Toast.LENGTH_SHORT).show();
                listView.smoothScrollToPosition(getPositionFromData(character));
            }
        });
```

If you want to set a **custom alphabet**:
```Java
 private String[] customAlphabet = {"A", "E", "I", "O","U"};
 
 Alphabetik alphabetik = (Alphabetik) findViewById(R.id.alphSectionIndex);
 alphabetik.setAlphabet(customAlphabet);
```
Set selected letter to **bold**:
```Java
Alphabetik alphabetik = (Alphabetik) findViewById(R.id.alphSectionIndex);
alphabetik.setLetterToBold(letter);
```

Set up your **Layout** as follows:
```XML
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <!-- You can use a RecyclerView or another "List" instead -->
    <ListView
        android:id="@+id/listView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:scrollbarStyle="outsideOverlay" />

    <com.alphabetik.Alphabetik
        android:id="@+id/alphSectionIndex"
        android:padding="2dp"
        android:layout_width="15dp"
        android:layout_height="wrap_content"
        android:layout_gravity="center_vertical"
        android:layout_marginLeft="10dp" />

</LinearLayout>
```

Customize **Letter** style, modify **item_letter.xml**:
```XML
<!-- Set any style you want -->
<TextView
        android:id="@+id/tvLetter"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textAlignment="center"
        android:textSize="12sp" />
```


## Installation
Add to gradle file, to the root gradle file (the one outside the "app" directory):
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Add the dependency to gradle file (build.gradle inside "app"):
```
dependencies {
	...
	compile 'com.github.richimf:Alphabetik:1.0.0'
}
```

## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :D

## Credits

Developed by Ricardo Montesinos /o.o/

## License
This code is distributed under the terms and conditions of the MIT license.
</content>
</snippet>
