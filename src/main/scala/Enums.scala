@main def enums: Unit = {

   enum Permissions {
     case READ, WRITE, EXEC, NONE
   }

  /**
   * compiler creates a sealed class
   * sealed class enums {
       READ etc as Constants
   * }
   */

   val read: Permissions = Permissions.READ

   println(read)

  //enums with args, enums can contain fields and methods, as sealed class

  enum PermissionsWithBits(val bits: Int) {
    case READ extends PermissionsWithBits(4) //100
    case WRITE extends PermissionsWithBits(2) //010
    case EXEC extends PermissionsWithBits(1) //001
    case NONE extends PermissionsWithBits(0) //000

    def toHex: String = Integer.toHexString(bits)
      //we can create variables,  not recommended
  }

  object PermissionsWithBits  {
    def fromBits(bits: Int): PermissionsWithBits = {
      //bit check e.g if second bit is 1 etc
      PermissionsWithBits.NONE
    }
  }

  val read2: PermissionsWithBits = PermissionsWithBits.READ
  val bitString = read2.bits
  println(bitString)

  val hexString: String = read2.toHex
  println(hexString)

  println(PermissionsWithBits.fromBits(100))

  //standard API methods
  val first = Permissions.READ.ordinal
  val second = Permissions.WRITE.ordinal
  println(first)
  println(second)

  println("------")
  val allPermissions = Permissions.values
  allPermissions.foreach(println)

  //we can create/convert string to one of our enum values
  val readPermission:Permissions = Permissions.valueOf("READ")
  println(readPermission)


}