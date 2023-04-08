package zhupff.gadget.widget

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import zhupff.gadget.widget.attr.cornerClip

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(FrameLayout(
            this, size = MATCH_PARENT to MATCH_PARENT
        ) {
            setBackgroundColor(Color.WHITE)
            ImageViewX(
                size = 400 to 400
            ) {
                frameLayoutParams {
                    gravity = Gravity.CENTER
                }
                cornerClip {
                    allCornerRadius = 200F
                }
                setImageResource(R.drawable.ic_launcher)
            }
        })
    }
}