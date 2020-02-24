package com.example.myapplication;

        import android.os.Bundle;
        import android.view.MenuItem;

        import com.example.myapplication.ui.dashboard.DashboardFragment;
        import com.example.myapplication.ui.home.HomeFragment;
        import com.example.myapplication.ui.notifications.NotificationsFragment;
        import com.google.android.material.bottomnavigation.BottomNavigationView;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.fragment.app.FragmentManager;
        import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    private DashboardFragment dash = new DashboardFragment();
    private NotificationsFragment notice = new NotificationsFragment();
    private FragmentManager fm = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.nav_host_fragment, dash).commitAllowingStateLoss();

        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            FragmentTransaction transaction = fm.beginTransaction();
            switch (menuItem.getItemId()){
                case R.id.navigation_test_list:
                    transaction.replace(R.id.nav_host_fragment, dash).commitAllowingStateLoss();
                    break;
                case R.id.navigation_test_result:
                    transaction.replace(R.id.nav_host_fragment, notice).commitAllowingStateLoss();
                    break;
            }
            return true;
        }
    };

}
