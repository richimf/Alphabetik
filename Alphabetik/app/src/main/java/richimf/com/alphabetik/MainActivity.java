package richimf.com.alphabetik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Implement your data as you prefer, but sort it.
    private ListView listView;

    final String[] orderedData = new String[]{"Ana", "Bere", "Cesar", "Diana", "Elena", "Foca", "Gaby", "Helena", "Ivan",
            "Juan", "Karla", "Luis", "Mau", "Noe", "Oscar", "Paty", "Queso", "Richi", "Sandra",
            "Tio", "Uva", "Vic", "Wey", "Xavi", "Yuya", "Zeno"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        //Listview implementation, with SORTED list of DATA
        listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, orderedData);
        listView.setAdapter(adapter);

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
        //alphabetik.setPositionLetterToBold(letter);
    }

    private int getPositionFromData(String character) {
        int position = 0;
        for (String s : orderedData) {
            String letter = "" + s.charAt(0);
            if (letter.equals("" + character)) {
                return position;
            }
            position++;
        }
        return 0;
    }
}
