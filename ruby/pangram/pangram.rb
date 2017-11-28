require 'pry'

class Pangram
  ALPHABETS = 'abcdefghijklmnopqrstuvwxyz'.split('')

  def self.pangram?(phrase)
    ALPHABETS.all? { |c| self.filter_alphabets(phrase).include?(c) }
  end

  private

    def self.filter_alphabets(s)
      s.split('').map(&:downcase).select { |c| c.match(/[A-Za-z]/) }
    end
end

module BookKeeping
  VERSION = 6
end
