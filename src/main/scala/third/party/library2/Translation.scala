package third.party.library2

import foreign.library2._

class Translation(val dictionary: Dictionary) {
  def translate(s: String): String = {
    val translationString = TranslationString(s, "someMetadata")
    dictionary.translate(translationString)
  }
}

