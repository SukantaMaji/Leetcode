

class Solution {
public:
    vector<string> spellchecker(vector<string>& wordlist, vector<string>& queries) {
        unordered_set<string> exact(wordlist.begin(), wordlist.end());
        unordered_map<string, string> caseMap;
        unordered_map<string, string> vMap;

        for (auto &word : wordlist) {
            string lowerC = toLower(word);
            if (caseMap.find(lowerC) == caseMap.end())
                caseMap[lowerC] = word;
            string ast = asTreic(lowerC);
            if (vMap.find(ast) == vMap.end())
                vMap[ast] = word;
        }

        vector<string> result;
        for (auto &queri : queries) {
            if (exact.count(queri)) {
                result.push_back(queri);
            } else {
                string lowerQueri = toLower(queri);
                if (caseMap.count(lowerQueri)) {
                    result.push_back(caseMap[lowerQueri]);
                } else {
                    string ast = asTreic(lowerQueri);
                    if (vMap.count(ast)) result.push_back(vMap[ast]);
                    else result.push_back("");
                }
            }
        }
        return result;
    }

private:
    string toLower(const string &s) {
        string res = s;
        for (auto &ch : res) ch = tolower(ch);
        return res;
    }

    string asTreic(const string &s) {
        string res;
        for (char ch : s) {
            if (isVowel(ch)) res.push_back('*');
            else res.push_back(ch);
        }
        return res;
    }

    bool isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
};
