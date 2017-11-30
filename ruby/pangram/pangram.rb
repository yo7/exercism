require 'set'

class Pangram
  ALPHABET_COUNT = 26

  def self.pangram?(phrase)
    phrase.downcase.gsub(/[^a-z]/, '').split('').to_set.size == ALPHABET_COUNT
  end
end

module BookKeeping
  VERSION = 6
end
