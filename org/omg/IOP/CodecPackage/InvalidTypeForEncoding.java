package org.omg.IOP.CodecPackage;


/**
* org/omg/IOP/CodecPackage/InvalidTypeForEncoding.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u181/11358/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Saturday, July 7, 2018 12:57:15 AM PDT
*/

public final class InvalidTypeForEncoding extends org.omg.CORBA.UserException
{

  public InvalidTypeForEncoding ()
  {
    super(InvalidTypeForEncodingHelper.id());
  } // ctor


  public InvalidTypeForEncoding (String $reason)
  {
    super(InvalidTypeForEncodingHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidTypeForEncoding