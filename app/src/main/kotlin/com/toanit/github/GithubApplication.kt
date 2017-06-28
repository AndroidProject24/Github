package com.toanit.github

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.FormatStrategy
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy
import com.toanit.core.R


/**
 * Created by Toan.IT on 6/19/17.
 * Email: huynhvantoan.itc@gmail.com
 */
class GithubApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        setupFresco()
        setupLogger()
    }

    fun setupLogger(){
        val formatStrategy: FormatStrategy = PrettyFormatStrategy.newBuilder()
                .tag(getString(R.string.app_name))
                .build()
        Logger.addLogAdapter(object : AndroidLogAdapter(formatStrategy) {
            override fun isLoggable(priority: Int, tag: String?): Boolean {
                return BuildConfig.DEBUG
            }
        })
    }

    fun setupFresco(){
        Fresco.initialize(this,null)//imagePipelineConfig
    }
}