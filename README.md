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

```
//Implementation
        Alphabetik alphabetik = (Alphabetik) findViewById(R.id.rvSectionIndex);
        //alphabetik.setAlphabet(String customAlphabet[]);
        alphabetik.onSectionIndexClickListener(new Alphabetik.SectionIndexClickListener() {
            @Override
            public void onItemClick(View view, int position, String character) {
                Log.i("View: ", "" + view + " Position = " + position + " Char = " + character);
                Toast.makeText(getBaseContext(), " Position = " + position + " Char = " + character, Toast.LENGTH_SHORT).show();
                listView.smoothScrollToPosition(getPositionFromData(character));
            }
        });
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
