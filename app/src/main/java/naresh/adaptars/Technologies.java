package naresh.adaptars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Technologies extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technologies);
        ListView lv = (ListView)findViewById(R.id.lv1);

        lv.setAdapter(new ListAdapter(this));
    }
}
