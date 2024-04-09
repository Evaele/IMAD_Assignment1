package com.example.assigment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declaration the view
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.btnCancel)
        val txtResult = findViewById<TextView>(R.id.txtResults)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 20..27 -> "Tupac Shakur"
                    in 28..35 -> "Alexander The Great"
                    in 36..44 -> "Brenda Fassie"
                    in 44..51 -> "Whitney Houston"
                    in 52..60 -> "Luke Perry"
                    in 60..67 -> "Leonard da Vinci"
                    in 68..75 -> "Oliver Mambo"
                    in 76..83 -> "Joan Rivers"
                    in 84..91 -> "Maya Angelou"
                    in 92..100 -> "Nelson Mandela"
                    else -> "not valid"
                }
                txtResult.text = "Age: $age\n${
                    when (result) {
                        "Tupac Shakur" -> "Tupac Shakur, otherwise called 2Pac, was a compelling rapper, entertainer, and activist. Brought into the world in 1971, his lovely verses and crude narrating featured social issues, ghetto battles, and the intricacies of life. Despite his shocking passing in 1996, Tupac's heritage perseveres through his music, moving endless artists and fans around the world."
                        "Alexander The Great" -> "Alexander the Incomparable, Macedonian lord, ruled from 336 to 323 BCE. Guided by Aristotle, he rose at 20, quickly overcoming Persia, Egypt, and then some. His immense domain spanned East and West, encouraging social trade (Greek time). His heritage perseveres through military strategies, city establishments, and social dispersion, molding old and current civilizations."
                        "Brenda Fassie" -> "Brenda Fassie, brought into the world in 1964 in South Africa, was a famous artist known as the \"Sovereign of African Pop.\" Ascending to notoriety during the 1980s, she mixed municipality pop with global impacts. Her hits like \"Vulindlela\" reverberated universally, procuring her unbelievable status regardless of a wild private life. Fassie died in 2004."
                        "Whitney Houston" -> "Whitney Houston was an American artist and entertainer brought into the world in 1963. Ascending to popularity during the 1980s, she became one of the most mind-blowing selling music specialists, known for hits like \"I Will Always Love You.\" Houston's profession was set apart by basic praise and individual battles until her sad passing in 2012."
                        "Luke Perry" -> "Luke Perry was an American entertainer brought into the world on October 11, 1966. He acquired distinction for his job as Dylan McKay on the television series \"Beverly Slopes, 90210\" during the 1990s. Perry's charming depiction made him a heart breaker and a social symbol. He died on March 4, 2019, abandoning an enduring inheritance"
                        "Leonard da Vinci" -> "Leonardo da Vinci, brought into the world in 1452 in Vinci, Italy, was a polymath of the Renaissance time. His virtuoso crossed workmanship, science, designing, and life systems. Well known for magnum opuses like \"Mona Lisa\" and \"The Last Dinner,\" he additionally made critical commitments to life systems, designing, and flight. His journals uncover his unquenchable interest and development."
                        "Oliver Tambo" -> "Oliver Tambo (1917-1993) was a critical figure in the counter politically-sanctioned racial segregation development in South Africa. Prime supporter of the African National Congress Youth Association, he became ANC President far away, banished for good during the politically-sanctioned racial segregation period. Tambo vigorously revitalized global help and conciliatory tension against politically-sanctioned racial segregation, laying urgent basis for South Africa's possible majority rule change."
                        "Joan Rivers" -> "Joan Waterways (1933-2014) was a notable American entertainer, entertainer, and TV have known for her sharp mind and limit pushing humor. Ascending to notoriety during the 1960s, she turned into a pioneer for ladies in parody, making ready for people in the future with her brave and disrespectful comedic style."
                        "Maya Angelou " -> "Maya Angelou (1928-2014) was a prestigious American creator, writer, and social liberties lobbyist. Her journal, \"I Know Why the Caged Bird Sings,\" brought her global praise. Angelou's persuasive works and strong talks resounded profoundly, tending to subjects of character, bigotry, and strength, making her a powerful voice in writing and civil rights"
                        "Nelson Mandela" -> "Nelson Mandela (1918-2013) was a noticeable forerunner in the counter politically-sanctioned racial segregation battle in South Africa. As ANC part and later president, he battled against racial isolation and mistreatment. Detained for quite some time, his delivery in 1990 denoted a defining moment. Mandela's administration (1994-1999) introduced another period of compromise and a majority rule government."
                        else -> "Please enter a valid age"
                        
                    }
                }"
            } else {
                txtResult.text = "Please enter a valid age"
            }
        }
        btnCancel.setOnClickListener {
            ageNumber.text.clear()
            txtResult.text = ""
        }
    }
}
