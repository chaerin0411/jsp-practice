 p a c k a g e   j s p b o o k . a d d r b o o k ;  
  
 i m p o r t   j a v a . s q l . * ;  
 i m p o r t   j a v a . u t i l . * ;  
  
 / * *  
   *   F i l e   :   A d d r B e a n . j a v a  
   *   D e s c   :  �����]  ��\����   D A O  �t��¤  
   *   @ a u t h o r  �i�l� ( d i n f r e e @ d i n f r e e . c o m )  
   * /  
 p u b l i c   c l a s s   A d d r B e a n   {    
 	  
 	 C o n n e c t i o n   c o n n   =   n u l l ;  
 	 P r e p a r e d S t a t e m e n t   p s t m t   =   n u l l ;  
 	  
 	 / *   O r a c l e  �����  
 	 S t r i n g   j d b c _ d r i v e r   =   " o r a c l e . j d b c . d r i v e r . O r a c l e D r i v e r " ;  
 	 S t r i n g   j d b c _ u r l   =   " j d b c : o r a c l e : t h i n : @ 2 2 0 . 6 8 . 1 4 . 7 : 1 5 2 1 " ;  
 	 * /  
 	  
 	 / *   M y S Q L  �����   * /  
 	 S t r i n g   j d b c _ d r i v e r   =   " c o m . m y s q l . j d b c . D r i v e r " ;  
 	 S t r i n g   j d b c _ u r l   =   " j d b c : m y s q l : / / 1 2 7 . 0 . 0 . 1 : 3 3 0 6 / j s p d b ? u s e U n i c o d e = t r u e & c h a r a c t e r E n c o d i n g = u t f - 8 " ;    
 	  
 	 / /   D B��  �T���  
 	 v o i d   c o n n e c t ( )   {  
 	 	 t r y   {  
 	 	 	 C l a s s . f o r N a m e ( j d b c _ d r i v e r ) ;  
  
 	 	 	 c o n n   =   D r i v e r M a n a g e r . g e t C o n n e c t i o n ( j d b c _ u r l , " r o o t " , " j a n g m i 2 9 " ) ;  
 	 	 }   c a t c h   ( E x c e p t i o n   e )   {  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 }  
 	 }  
 	  
 	 v o i d   d i s c o n n e c t ( )   {  
 	 	 i f ( p s t m t   ! =   n u l l )   {  
 	 	 	 t r y   {  
 	 	 	 	 p s t m t . c l o s e ( ) ;  
 	 	 	 }   c a t c h   ( S Q L E x c e p t i o n   e )   {  
 	 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 	 }  
 	 	 }    
 	 	 i f ( c o n n   ! =   n u l l )   {  
 	 	 	 t r y   {  
 	 	 	 	 c o n n . c l o s e ( ) ;  
 	 	 	 }   c a t c h   ( S Q L E x c e p t i o n   e )   {  
 	 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 	 }  
 	 	 }  
 	 }  
 	  
 	 / /  ���  �����]  ��Ʃ  �1���D  ��\  �T���  
 	 p u b l i c   b o o l e a n   u p d a t e D B ( A d d r B o o k   a d d r b o o k )   {  
 	 	 c o n n e c t ( ) ;  
 	 	  
 	 	 S t r i n g   s q l   = " u p d a t e   a d d r b o o k   s e t   a b _ n a m e = ? ,   a b _ e m a i l = ? ,   a b _ b i r t h = ? ,   a b _ t e l = ? ,   a b _ c o m d e p t = ? ,   a b _ m e m o = ?   w h e r e   a b _ i d = ? " ; 	 	  
 	 	    
 	 	 t r y   {  
 	 	 	 p s t m t   =   c o n n . p r e p a r e S t a t e m e n t ( s q l ) ;  
 	 	 	 p s t m t . s e t S t r i n g ( 1 , a d d r b o o k . g e t A b _ n a m e ( ) ) ;  
 	 	 	 p s t m t . s e t S t r i n g ( 2 , a d d r b o o k . g e t A b _ e m a i l ( ) ) ;  
 	 	 	 p s t m t . s e t S t r i n g ( 3 ,   a d d r b o o k . g e t A b _ b i r t h ( ) ) ;  
 	 	 	 p s t m t . s e t S t r i n g ( 4 , a d d r b o o k . g e t A b _ t e l ( ) ) ;  
 	 	 	 p s t m t . s e t S t r i n g ( 5 , a d d r b o o k . g e t A b _ c o m d e p t ( ) ) ;  
 	 	 	 p s t m t . s e t S t r i n g ( 6 , a d d r b o o k . g e t A b _ m e m o ( ) ) ;  
 	 	 	 p s t m t . s e t I n t ( 7 , a d d r b o o k . g e t A b _ i d ( ) ) ;  
 	 	 	 p s t m t . e x e c u t e U p d a t e ( ) ;  
 	 	 }   c a t c h   ( S Q L E x c e p t i o n   e )   {  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 }  
 	 	 f i n a l l y   {  
 	 	 	 d i s c o n n e c t ( ) ;  
 	 	 }  
 	 	 r e t u r n   t r u e ;  
 	 }  
 	  
 	 / /  ҹ�  �����]  ���ܮ   ���  �T���  
 	 p u b l i c   b o o l e a n   d e l e t e D B ( i n t   g b _ i d )   {  
 	 	 c o n n e c t ( ) ;  
 	 	  
 	 	 S t r i n g   s q l   = " d e l e t e   f r o m   a d d r b o o k   w h e r e   a b _ i d = ? " ;  
 	 	  
 	 	 t r y   {  
 	 	 	 p s t m t   =   c o n n . p r e p a r e S t a t e m e n t ( s q l ) ;  
 	 	 	 p s t m t . s e t I n t ( 1 , g b _ i d ) ;  
 	 	 	 p s t m t . e x e c u t e U p d a t e ( ) ;  
 	 	 }   c a t c h   ( S Q L E x c e p t i o n   e )   {  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 }  
 	 	 f i n a l l y   {  
 	 	 	 d i s c o n n e c t ( ) ;  
 	 	 }  
 	 	 r e t u r n   t r u e ;  
 	 }  
 	  
 	 / /  ���  �����]  �T����  ͔�   �T���  
 	 p u b l i c   b o o l e a n   i n s e r t D B ( A d d r B o o k   a d d r b o o k )   {  
 	 	 c o n n e c t ( ) ;  
 	 	 / /   s q l  �8ǐ��   ,   g b _ i d  ��  ǐ��  ��]  ����\  ǅ�%�X��  �J���� .  
 	 	 	 	  
 	 	 S t r i n g   s q l   = " i n s e r t   i n t o   a d d r b o o k ( a b _ n a m e , a b _ e m a i l , a b _ b i r t h , a b _ t e l , a b _ c o m d e p t , a b _ m e m o )   v a l u e s ( ? , ? , ? , ? , ? , ? ) " ;  
 	 	  
 	 	 t r y   {  
 	 	 	 p s t m t   =   c o n n . p r e p a r e S t a t e m e n t ( s q l ) ;  
 	 	 	 p s t m t . s e t S t r i n g ( 1 , a d d r b o o k . g e t A b _ n a m e ( ) ) ;  
 	 	 	 p s t m t . s e t S t r i n g ( 2 , a d d r b o o k . g e t A b _ e m a i l ( ) ) ;  
 	 	 	 p s t m t . s e t S t r i n g ( 3 ,   a d d r b o o k . g e t A b _ b i r t h ( ) ) ;  
 	 	 	 p s t m t . s e t S t r i n g ( 4 , a d d r b o o k . g e t A b _ t e l ( ) ) ;  
 	 	 	 p s t m t . s e t S t r i n g ( 5 , a d d r b o o k . g e t A b _ c o m d e p t ( ) ) ;  
 	 	 	 p s t m t . s e t S t r i n g ( 6 , a d d r b o o k . g e t A b _ m e m o ( ) ) ;  
 	 	 	 p s t m t . e x e c u t e U p d a t e ( ) ;  
 	 	 }   c a t c h   ( S Q L E x c e p t i o n   e )   {  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 }  
 	 	 f i n a l l y   {  
 	 	 	 d i s c o n n e c t ( ) ;  
 	 	 }  
 	 	 r e t u r n   t r u e ;  
 	 }  
  
 	 / /  ҹ�  �����]  ���ܮ   � �8�$��  �T���  
 	 p u b l i c   A d d r B o o k   g e t D B ( i n t   g b _ i d )   {  
 	 	 c o n n e c t ( ) ;  
 	 	  
 	 	 S t r i n g   s q l   =   " s e l e c t   *   f r o m   a d d r b o o k   w h e r e   a b _ i d = ? " ;  
 	 	 A d d r B o o k   a d d r b o o k   =   n e w   A d d r B o o k ( ) ;  
 	 	  
 	 	 t r y   {  
 	 	 	 p s t m t   =   c o n n . p r e p a r e S t a t e m e n t ( s q l ) ;  
 	 	 	 p s t m t . s e t I n t ( 1 , g b _ i d ) ;  
 	 	 	 R e s u l t S e t   r s   =   p s t m t . e x e c u t e Q u e r y ( ) ;  
 	 	 	  
 	 	 	 / /  �p�t�0�   �X����  ǈ�<���\   r s . n e x t ( )�|  �\����  ��Չ  �\�� .  
 	 	 	 r s . n e x t ( ) ;  
 	 	 	 a d d r b o o k . s e t A b _ i d ( r s . g e t I n t ( " a b _ i d " ) ) ;  
 	 	 	 a d d r b o o k . s e t A b _ n a m e ( r s . g e t S t r i n g ( " a b _ n a m e " ) ) ;  
 	 	 	 a d d r b o o k . s e t A b _ e m a i l ( r s . g e t S t r i n g ( " a b _ e m a i l " ) ) ;  
 	 	 	 a d d r b o o k . s e t A b _ b i r t h ( r s . g e t S t r i n g ( " a b _ b i r t h " ) ) ;  
 	 	 	 a d d r b o o k . s e t A b _ t e l ( r s . g e t S t r i n g ( " a b _ t e l " ) ) ;  
 	 	 	 a d d r b o o k . s e t A b _ c o m d e p t ( r s . g e t S t r i n g ( " a b _ c o m d e p t " ) ) ;  
 	 	 	 a d d r b o o k . s e t A b _ m e m o ( r s . g e t S t r i n g ( " a b _ m e m o " ) ) ;  
 	 	 	 r s . c l o s e ( ) ;  
 	 	 }   c a t c h   ( S Q L E x c e p t i o n   e )   {  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 }  
 	 	 f i n a l l y   {  
 	 	 	 d i s c o n n e c t ( ) ;  
 	 	 }  
 	 	 r e t u r n   a d d r b o o k ;  
 	 }  
 	  
 	 / /  �̴  �����]  ���]�D  � �8�$��  �T���  
 	 p u b l i c   A r r a y L i s t < A d d r B o o k >   g e t D B L i s t ( )   {  
 	 	 c o n n e c t ( ) ;  
 	 	 A r r a y L i s t < A d d r B o o k >   d a t a s   =   n e w   A r r a y L i s t < A d d r B o o k > ( ) ;  
 	 	  
 	 	 S t r i n g   s q l   =   " s e l e c t   *   f r o m   a d d r b o o k   o r d e r   b y   a b _ i d   d e s c " ;  
 	 	 t r y   {  
 	 	 	 p s t m t   =   c o n n . p r e p a r e S t a t e m e n t ( s q l ) ;  
 	 	 	 R e s u l t S e t   r s   =   p s t m t . e x e c u t e Q u e r y ( ) ;  
 	 	 	 w h i l e ( r s . n e x t ( ) )   {  
 	 	 	 	 A d d r B o o k   a d d r b o o k   =   n e w   A d d r B o o k ( ) ;  
 	 	 	 	  
 	 	 	 	 a d d r b o o k . s e t A b _ i d ( r s . g e t I n t ( " a b _ i d " ) ) ;  
 	 	 	 	 a d d r b o o k . s e t A b _ n a m e ( r s . g e t S t r i n g ( " a b _ n a m e " ) ) ;  
 	 	 	 	 a d d r b o o k . s e t A b _ e m a i l ( r s . g e t S t r i n g ( " a b _ e m a i l " ) ) ;  
 	 	 	 	 a d d r b o o k . s e t A b _ c o m d e p t ( r s . g e t S t r i n g ( " a b _ c o m d e p t " ) ) ;  
 	 	 	 	 a d d r b o o k . s e t A b _ b i r t h ( r s . g e t S t r i n g ( " a b _ b i r t h " ) ) ;  
 	 	 	 	 a d d r b o o k . s e t A b _ t e l ( r s . g e t S t r i n g ( " a b _ t e l " ) ) ;  
 	 	 	 	 a d d r b o o k . s e t A b _ m e m o ( r s . g e t S t r i n g ( " a b _ m e m o " ) ) ;  
 	 	 	 	 d a t a s . a d d ( a d d r b o o k ) ;  
 	 	 	 }  
 	 	 	 r s . c l o s e ( ) ;  
 	 	 	  
 	 	 }   c a t c h   ( S Q L E x c e p t i o n   e )   {  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 }  
 	 	 f i n a l l y   {  
 	 	 	 d i s c o n n e c t ( ) ;  
 	 	 }  
 	 	 r e t u r n   d a t a s ;  
 	 }  
 }