package cupbook.examples.chapter6

class Rational(n: Int, d: Int) {
  // 分数のクラス
  // 1. コンストラクタ
  // 2. toString
  
  override def toString = if (denom == 1) numer.toString else numer + "/" + denom
  
  // 3. 分母0を禁止
  require(d!=0)
  
  // 4. 大小比較ができる
  def lessThan : Rational => Boolean = (that) => that.numer * this.d > that.denom * this.n
  
  // 5. 約分を自動的にする
  def this(n: Int) = this(n, 1)
  private val g = gcd(n, d)
  def gcd(a: Int, b: Int) : Int = 
    if (b == 0) a else gcd(b, a%b)
  
  var numer = n / g
  val denom = d / g
  
  // 6. + - * / を実装
  def + (that: Rational) : Rational = 
    new Rational(this.d * that.numer + this.n * that.denom, that.denom * this.d)
  
  def * (that: Rational) : Rational = 
    new Rational(this.n * that.numer, this.d * that.denom)
  
  def - (that: Rational) : Rational = this + new Rational(-1) * that
  
  // def / (that: Rational) : Rational = this * that.inverse 
  
  // 7. 分数同士でなく、Int + Rationalを実装する
  def + (that: Int) : Rational = new Rational(that, 1) + this
  def * (that: Int) : Rational = new Rational(that, 1) * this
  def - (that: Int) : Rational = new Rational(that, 1) - this
}