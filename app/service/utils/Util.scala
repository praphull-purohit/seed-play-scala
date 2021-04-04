package service.utils

import java.util.Base64

object Util {
  def b64Decode(str: String): Array[Byte] = Base64.getDecoder.decode(str)

  def b64Encode(bytes: Array[Byte]): Array[Byte] = Base64.getEncoder.encode(bytes)

  def b64EncodeToString(bytes: Array[Byte]): String = Base64.getEncoder.encodeToString(bytes)
}
