package org.devio.`as`.hi.hi_arouter

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textView = findViewById<TextView>(R.id.text_view)
        textView.setOnClickListener {
            println("123")
//            ARouter.getInstance().build("/activity/second")
            ARouter.getInstance().build("/trade/detail/fragment")
                .withString("shopId", "1001")
                .withString("saleId", "1002")
                .navigation()

//            ARouter.getInstance().build("/activity/second")
//                .navigation()
        }
    }
}
