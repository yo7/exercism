require 'pry'

class Pangram
  def self.pangram?(phrase)
    target = phrase.downcase
    ('a'..'z').all? { |c| target.include?(c) }
  end
end

module BookKeeping
  VERSION = 6
end
