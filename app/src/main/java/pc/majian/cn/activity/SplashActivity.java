package pc.majian.cn.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import pc.majian.cn.utils.PackageInfomation;

public class SplashActivity extends Activity {

    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview() ;
    }

    private void initview() {
        mTv = (TextView) findViewById(R.id.splash_tv_versionname);

        mTv.setText("版本号:"+PackageInfomation.getVersionName(this));


    }


}
