package com.toanit.core.utils

import android.content.Context
import android.support.v4.content.ContextCompat

/**
 * Created by Toan.IT on 6/13/17.
 * Email: huynhvantoan.itc@gmail.com
 */



fun Context.color(res: Int): Int = ContextCompat.getColor(this, res)