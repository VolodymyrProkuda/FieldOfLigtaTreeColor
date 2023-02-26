package com.foltc.fieldofligtatreecolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.DrawableRes
import com.foltc.fieldofligtatreecolor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val arrayOfLights = mutableListOf<Int>(0,0,0,0,0,
        0,0,0,0,0,
        0,0,0,0,0,
        0,0,0,0,0,
        0,0,0,0,0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding.imageView) {
            setOnClickListener {
                arrayOfLights[0] = changeColor(arrayOfLights[0])
                when(arrayOfLights[0]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView2) {
            setOnClickListener {
                arrayOfLights[1] = changeColor(arrayOfLights[1])
                when(arrayOfLights[1]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView3) {
            setOnClickListener {
                arrayOfLights[2] = changeColor(arrayOfLights[2])
                when(arrayOfLights[2]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView4) {
            setOnClickListener {
                arrayOfLights[3] = changeColor(arrayOfLights[3])
                when(arrayOfLights[3]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView5) {
            setOnClickListener {
                arrayOfLights[4] = changeColor(arrayOfLights[4])
                when(arrayOfLights[4]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView6) {
            setOnClickListener {
                arrayOfLights[5] = changeColor(arrayOfLights[5])
                when(arrayOfLights[5]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView7) {
            setOnClickListener {
                arrayOfLights[6] = changeColor(arrayOfLights[6])
                when(arrayOfLights[6]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView8) {
            setOnClickListener {
                arrayOfLights[7] = changeColor(arrayOfLights[7])
                when(arrayOfLights[7]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView9) {
            setOnClickListener {
                arrayOfLights[8] = changeColor(arrayOfLights[8])
                when(arrayOfLights[8]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView10) {
            setOnClickListener {
                arrayOfLights[9] = changeColor(arrayOfLights[9])
                when(arrayOfLights[9]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView11) {
            setOnClickListener {
                arrayOfLights[10] = changeColor(arrayOfLights[10])
                when(arrayOfLights[10]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView12) {
            setOnClickListener {
                arrayOfLights[11] = changeColor(arrayOfLights[11])
                when(arrayOfLights[11]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView13) {
            setOnClickListener {
                arrayOfLights[12] = changeColor(arrayOfLights[12])
                when(arrayOfLights[12]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView14) {
            setOnClickListener {
                arrayOfLights[13] = changeColor(arrayOfLights[13])
                when(arrayOfLights[13]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView15) {
            setOnClickListener {
                arrayOfLights[14] = changeColor(arrayOfLights[14])
                when(arrayOfLights[14]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView16) {
            setOnClickListener {
                arrayOfLights[15] = changeColor(arrayOfLights[15])
                when(arrayOfLights[15]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView17) {
            setOnClickListener {
                arrayOfLights[16] = changeColor(arrayOfLights[16])
                when(arrayOfLights[16]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView18) {
            setOnClickListener {
                arrayOfLights[17] = changeColor(arrayOfLights[17])
                when(arrayOfLights[17]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView19) {
            setOnClickListener {
                arrayOfLights[18] = changeColor(arrayOfLights[18])
                when(arrayOfLights[18]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView20) {
            setOnClickListener {
                arrayOfLights[19] = changeColor(arrayOfLights[19])
                when(arrayOfLights[19]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView21) {
            setOnClickListener {
                arrayOfLights[20] = changeColor(arrayOfLights[20])
                when(arrayOfLights[20]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView22) {
            setOnClickListener {
                arrayOfLights[21] = changeColor(arrayOfLights[21])
                when(arrayOfLights[21]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView23) {
            setOnClickListener {
                arrayOfLights[22] = changeColor(arrayOfLights[22])
                when(arrayOfLights[22]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView24) {
            setOnClickListener {
                arrayOfLights[23] = changeColor(arrayOfLights[23])
                when(arrayOfLights[23]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }
        with(binding.imageView25) {
            setOnClickListener {
                arrayOfLights[24] = changeColor(arrayOfLights[24])
                when(arrayOfLights[24]) {
                    1 -> setImageResource(R.drawable.light_yellow)
                    2 -> setImageResource(R.drawable.light_blue)
                    else -> setImageResource(R.drawable.light_red)
                }
            }
        }

    }
    fun changeColor(n1 : Int ): Int {

        if (n1<2) return n1+1 else return 0

    }


}