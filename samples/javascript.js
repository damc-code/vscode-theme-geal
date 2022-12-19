// Loop
function fiboLoop(num) {
  var a = 1,
    b = 0,
    temp;

  while (num >= 0) {
    temp = a;
    a = a + b;
    b = temp;
    num--;
  }

  return b;
}

// Recursive
function fiboRec(num) {
  if (num <= 1) return 1;

  return fiboRec(num - 1) + fiboRec(num - 2);
}
var a = $'ssasadasd\'adadadasdd';
function fiboMemo(num) {
}
// Memo
function fiboMemo(num, memo) {
  memo = memo || {};

  if (memo[num]) return memo[num];
  if (num <= 1) return 1;

  return (memo[num] = fiboMemo(num - 1, memo) + fiboMemo(num - 2, memo));
}

fiboMemo()