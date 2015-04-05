package loserpool.nghiadang.loserball;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;

/**
 * Created by nghia.dang on 3/28/2015.
 */
public class SelectaTeamActivity extends BaseActivity implements AdapterView.OnItemSelectedListener{

    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getLayoutInflater().inflate(R.layout.activity_selectateam, frameLayout);

        mDrawerList.setItemChecked(position, true);
        setTitle(listArray[position]);




        //((ImageView)findViewById(R.id.image_view)).setBackgroundResource(R.drawable.image1);

       RecyclerView recyclerView1 = (RecyclerView) findViewById(R.id.recyclerView);


        ItemData itemData[] = {new ItemData("Arizona C.", R.drawable.bronco_image),
                new ItemData("Atlanta F.", R.drawable.bronco_image),
                new ItemData("Baltimore R.", R.drawable.bronco_image),
                new ItemData("Buffalo B.", R.drawable.bronco_image),
                new ItemData("Carolina P.", R.drawable.bronco_image),
                new ItemData("Chicago B.", R.drawable.bronco_image),
                new ItemData("Cincinnati B.", R.drawable.bronco_image),
                new ItemData("Cleveland B.", R.drawable.bronco_image),
                new ItemData("Denver B.", R.drawable.bronco_image),
                new ItemData("Dallas C.", R.drawable.bronco_image),
                new ItemData("Detroit L.", R.drawable.bronco_image),
                new ItemData("Indianapolis C.", R.drawable.bronco_image),
                new ItemData("Green Bay P.", R.drawable.bronco_image),
                new ItemData("Jacksonville J.", R.drawable.bronco_image),
                new ItemData("Minnesota V.", R.drawable.bronco_image),
                new ItemData("Kansas City C.", R.drawable.bronco_image),
                new ItemData("New Orleans S.", R.drawable.bronco_image),
                new ItemData("Miami D.", R.drawable.bronco_image),
                new ItemData("New York G.", R.drawable.bronco_image),
                new ItemData("New England P.", R.drawable.bronco_image),
                new ItemData("Philadelphia E.", R.drawable.bronco_image),
                new ItemData("New York J.", R.drawable.bronco_image),
                new ItemData("Saint Louis R.", R.drawable.bronco_image),
                new ItemData("Oakland R.", R.drawable.bronco_image),
                new ItemData("San Francisco F.", R.drawable.bronco_image),
                new ItemData("Pittsburgh S.", R.drawable.bronco_image),
                new ItemData("Seattle S.", R.drawable.bronco_image),
                new ItemData("San Diego C.", R.drawable.bronco_image),
                new ItemData("Tampa Bay B.", R.drawable.bronco_image),
                new ItemData("Tennessee T.", R.drawable.bronco_image),
                new ItemData("Washington R.", R.drawable.bronco_image),};


        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        MyListAdapter myListAdapter = new MyListAdapter(itemData);
        recyclerView1.setAdapter(myListAdapter);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());

        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.weeks, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

