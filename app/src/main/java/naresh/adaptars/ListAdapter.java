package naresh.adaptars;

import android.content.Context;
import android.graphics.Color;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Naresh on 10-12-2016.
 */

public class ListAdapter extends BaseAdapter
{
    Context c;

    String Technologies [] = {"SAP","Microsoft ","Odoo ","Java ","Salesforce","SugarCRM","Suite CRM","Vtiger CRM"};
    int images[] = {R.drawable.sap,R.drawable.microsoft,R.drawable.odoo,R.drawable.java,R.drawable.salesforce,R.drawable.sugar,R.drawable.suite,R.drawable.vtiger};

    public ListAdapter(Context c)
    {
        this.c = c;
    }


    @Override
    public int getCount()
    {
        return Technologies.length;
    }

    @Override
    public Object getItem(int i)
    {
        return Technologies[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        LayoutInflater li = (LayoutInflater)c.getSystemService(c.LAYOUT_INFLATER_SERVICE);
        View v = li.inflate(R.layout.sample,viewGroup,false);

        ImageView i1 = (ImageView)v.findViewById(R.id.iv);
        TextView t1 = (TextView) v.findViewById(R.id.tv);

        i1.setImageResource(images[i]);
        t1.setText(Technologies[i]);

        return v;
    }
}
