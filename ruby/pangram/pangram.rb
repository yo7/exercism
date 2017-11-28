require 'pry'

class Pangram
  def self.pangram?(phrase)
    ('a'..'z').all? { |c| phrase.downcase.include?(c) }
  end
end

module BookKeeping
  VERSION = 6
end
