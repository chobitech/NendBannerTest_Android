package com.chobitech.sample.app.nendbannertest_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import net.nend.android.NendAdListener
import net.nend.android.NendAdView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //--- show Nend banner - size = 320x50
        val spotId: Int = 3174  // 320x50 banner test Spot ID
        val apiKey: String = "c5cb8bc474345961c6e7a9778c947957ed8e1e4f"     // 320x50 banner test API key
        val adContainer: LinearLayout = findViewById(R.id.nendBannerContainer)

        val nendBannerView = NendAdView(this, spotId, apiKey)
        //--- set ad listener
        nendBannerView.setListener(object : NendAdListener {
            override fun onReceiveAd(p0: NendAdView) {
                // on load ad succeeded
            }

            override fun onFailedToReceiveAd(p0: NendAdView) {
                // on load ad failed
            }

            override fun onClick(p0: NendAdView) {
                // on clicked
            }

            override fun onDismissScreen(p0: NendAdView) {
                // on dismissed
            }
        })
        adContainer.addView(nendBannerView)
        nendBannerView.loadAd()
    }
}