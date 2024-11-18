package com.natanpaulo.info_medicamentos

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.natanpaulo.info_medicamentos.databinding.ActivityRivotrilBinding

class Rivotril : AppCompatActivity() {
    private lateinit var bc : ActivityRivotrilBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        bc = ActivityRivotrilBinding.inflate(layoutInflater)
        setContentView(bc.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        bc.toolbar.setNavigationOnClickListener {
            finish()

        }
    }
}