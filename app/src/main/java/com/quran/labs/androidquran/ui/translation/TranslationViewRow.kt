package com.quran.labs.androidquran.ui.translation

import androidx.annotation.IntDef
import com.quran.data.model.SuraAyah
import com.quran.labs.androidquran.common.QuranAyahInfo

internal class TranslationViewRow @JvmOverloads constructor(
  @field:Type val type: Int,
  val ayahInfo: QuranAyahInfo,
  val data: CharSequence? = null,
  val translationIndex: Int = -1,
  val link: SuraAyah? = null,
  val isArabic: Boolean = false,
  val ayat: List<IntRange> = emptyList(),
  val footnotes: List<IntRange> = emptyList()
) {
  @IntDef(
    Type.BASMALLAH,
    Type.SURA_HEADER,
    Type.QURAN_TEXT,
    Type.TRANSLATOR,
    Type.TRANSLATION_TEXT,
    Type.VERSE_NUMBER,
    Type.SPACER
  )
  internal annotation class Type {
    companion object {
      const val BASMALLAH = 0
      const val SURA_HEADER = 1
      const val QURAN_TEXT = 2
      const val TRANSLATOR = 3
      const val TRANSLATION_TEXT = 4
      const val VERSE_NUMBER = 5
      const val SPACER = 6
    }
  }
}
