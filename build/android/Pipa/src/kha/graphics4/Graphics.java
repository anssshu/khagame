// Generated by Haxe 3.4.2
package kha.graphics4;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface Graphics extends haxe.lang.IHxObject
{
	void begin(haxe.root.Array<kha.Canvas> additionalRenderTargets);
	
	void beginFace(int face);
	
	void beginEye(int eye);
	
	void end();
	
	boolean vsynced();
	
	int refreshRate();
	
	void clear(java.lang.Object color, java.lang.Object depth, java.lang.Object stencil);
	
	void viewport(int x, int y, int width, int height);
	
	void scissor(int x, int y, int width, int height);
	
	void disableScissor();
	
	void setVertexBuffer(kha.graphics4.VertexBuffer vertexBuffer);
	
	void setVertexBuffers(haxe.root.Array<kha.graphics4.VertexBuffer> vertexBuffers);
	
	void setIndexBuffer(kha.graphics4.IndexBuffer indexBuffer);
	
	void setTexture(kha.graphics4.TextureUnit unit, kha.Image texture);
	
	void setTextureDepth(kha.graphics4.TextureUnit unit, kha.Image texture);
	
	void setTextureArray(kha.graphics4.TextureUnit unit, kha.Image texture);
	
	void setVideoTexture(kha.graphics4.TextureUnit unit, kha.Video texture);
	
	void setImageTexture(kha.graphics4.TextureUnit unit, kha.Image texture);
	
	void setTextureParameters(kha.graphics4.TextureUnit texunit, kha.graphics4.TextureAddressing uAddressing, kha.graphics4.TextureAddressing vAddressing, kha.graphics4.TextureFilter minificationFilter, kha.graphics4.TextureFilter magnificationFilter, kha.graphics4.MipMapFilter mipmapFilter);
	
	void setTexture3DParameters(kha.graphics4.TextureUnit texunit, kha.graphics4.TextureAddressing uAddressing, kha.graphics4.TextureAddressing vAddressing, kha.graphics4.TextureAddressing wAddressing, kha.graphics4.TextureFilter minificationFilter, kha.graphics4.TextureFilter magnificationFilter, kha.graphics4.MipMapFilter mipmapFilter);
	
	void setCubeMap(kha.graphics4.TextureUnit unit, kha.graphics4.CubeMap cubeMap);
	
	void setCubeMapDepth(kha.graphics4.TextureUnit unit, kha.graphics4.CubeMap cubeMap);
	
	boolean renderTargetsInvertedY();
	
	boolean instancedRenderingAvailable();
	
	void setPipeline(kha.graphics4.PipelineState pipeline);
	
	void setBool(kha.graphics4.ConstantLocation location, boolean value);
	
	void setInt(kha.graphics4.ConstantLocation location, int value);
	
	void setFloat(kha.graphics4.ConstantLocation location, double value);
	
	void setFloat2(kha.graphics4.ConstantLocation location, double value1, double value2);
	
	void setFloat3(kha.graphics4.ConstantLocation location, double value1, double value2, double value3);
	
	void setFloat4(kha.graphics4.ConstantLocation location, double value1, double value2, double value3, double value4);
	
	void setFloats(kha.graphics4.ConstantLocation location, double[] floats);
	
	void setVector2(kha.graphics4.ConstantLocation location, kha.math.FastVector2 value);
	
	void setVector3(kha.graphics4.ConstantLocation location, kha.math.FastVector3 value);
	
	void setVector4(kha.graphics4.ConstantLocation location, kha.math.FastVector4 value);
	
	void setMatrix(kha.graphics4.ConstantLocation location, kha.math.FastMatrix4 value);
	
	void setMatrix3(kha.graphics4.ConstantLocation location, kha.math.FastMatrix3 value);
	
	void drawIndexedVertices(java.lang.Object start, java.lang.Object count);
	
	void drawIndexedVerticesInstanced(int instanceCount, java.lang.Object start, java.lang.Object count);
	
	void flush();
	
}


