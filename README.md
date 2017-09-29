[![Java programming language](https://img.shields.io/badge/language-Java-bf7b3b.svg)](http://www.oracle.com/technetwork/java/index.html "Java programming language")
[![MIT License](https://img.shields.io/badge/license-MIT-1e90ff.svg)](MIT-LICENSE.md "MIT License")

# Alphabetik

<snippet>
  <content><![CDATA[
# ${1:Project Name}

This project allows you to put an "Alphabet Section Index" beside your "ListView/RecyclerView" or any other "ScrollViewList" on your app. It is easy to use!. This is alike "Section Index" for iOS.

## Installation

A step by step series of examples that tell you have to get a development env running

Say what the step will be

```
Give the example
```

And repeat

## Usage
Implement in your **Activity** as follows:
```Java
Alphabetik alphabetik = (Alphabetik) findViewById(R.id.alphSectionIndex);
        alphabetik.onSectionIndexClickListener(new Alphabetik.SectionIndexClickListener() {
            @Override
            public void onItemClick(View view, int position, String character) {
                String info = " Position = " + position + " Char = " + character;
                Log.i("View: ", view + "," + info);
                Toast.makeText(getBaseContext(), info, Toast.LENGTH_SHORT).show();
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
Set custom letter to **bold**:
```Java
Alphabetik alphabetik = (Alphabetik) findViewById(R.id.alphSectionIndex);
alphabetik.setPositionLetterToBold(letter);
```

## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :D

## Credits

Developed by Ricardo Montesinos

## License
This code is distributed under the terms and conditions of the MIT license.
</content>
</snippet>
