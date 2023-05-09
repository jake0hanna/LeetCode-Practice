public class MockInterview 
{


    /*
Finite Poetry Protocol (from the docs, PDF, page 42)

| Poem (variable size)                                                       |
+-------------+-------------+-------------+-----------------+----------------+
| PoetryLine1 | PoetryLine2 | PoetryLine3 | PoetryLineN ... | EndPoem (0x00) |

| PoetryLine  (3 bytes)                                    |
+--------------------+-------------+-----------------------+
| PartOfSpeech uint8 | Count uint8 | DictionaryIndex uint8 |

Pseudo-BNF:
PoetryLine = PartOfSpeech uint8 | Count uint8 | DictionaryIndex uint8
Poem = PoetryLine* | endOfPoem
*/

    public class BitPoetry 
    {

        enum PartOfSpeech {
            END_OF_POEM,
            VERB,
            NOUN,
            ADJECTIVE
        }

        static String[] verbs = { "jump", "dance", "scream" };
        static String[] nouns = { "fish", "bear", "taco" };
        static String[] adjectives = { "blue", "tasty", "smelly" };

        static byte[] poem = { 0x01, (byte) 0xA0, 0x00, 0x03, 0x02, 0x02, 0x02, 0x01, 0x00, 0x00 };

        public static void main(String[] args) {
            // print our poem!

        }
    }  
}
