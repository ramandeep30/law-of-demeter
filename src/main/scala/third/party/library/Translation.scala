package third.party.library

import foreign.library.Dictionary

class Translation(val dictionary: Dictionary)  {
  def translate(s: String): String =
    dictionary.translate(s)
}