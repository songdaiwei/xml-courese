xquery version "1.0";
<html>
	<head>
		<title>������</title>
	</head>
<body>
	<h1>1.����ӳʱ������(����ʾ��Ӱ�������ݺ���ӳʱ��)��</h1>
	<table boder="3">
		<tr>
			<th>��Ӱ��</th>
			<th>����</th>
			<th>��ӳʱ��</th>
		</tr>
	{	
		for $movie in doc("movie.xml")/movies/movie
		let $movie_name:=$movie/movie_name,$director:=$movie/director,$release_time:=$movie/release_time
		order by $release_time 
		return 
		<tr>
			<td>{data($movie_name)}</td>
			<td>{data($director )}</td>
			<td>{data($release_time)}</td>
		</tr>
	}
	</table>
	<h2>2.ѡ��ʱ����130���£�������8.0���ϵĵ�Ӱ������ʾ��Ӱ����ʱ�������֣�</h2>
	<table boder="3">
		<tr>
			<th>��Ӱ��</th>
			<th>ʱ��</th>
			<th>����</th>
		</tr>
	{	
		for $movie in doc("movie.xml")/movies/movie
		let $movie_name:=$movie/movie_name,$length:=$movie/length,$score:=$movie/score
		where $score > 8.0 and $length < 140
		order by $score descending
		return 
		<tr>
			<td>{data($movie_name)}</td>
			<td>{data($length  )}</td>
			<td>{data($score)}</td>
		</tr>
	}
	
	</table>
	
	<h3>3.ѡ�� ղķ˹_��÷¡ ָ���ĵ�Ӱ�У�������ߵ�������Ӱ��</h3>
	<table boder ="3">
		<tr>��Ӱ��</tr>
		<tr>����</tr>
		<tr>��ӳʱ��</tr>
	{
		let $movielist:=(
			            for $movie in doc("movie.xml")/movies/movie
			            let $movie_name:=$movie/movie_name
			            let $score:=$movie/score
			            let $release_time:=$movie/release_time
			            let $director:=$movie/director
			            where $director = "ղķ˹_��÷¡"
			            order by $score descending
			            return 
								<movie>
								{$movie/@*}
								{$movie/*}
								</movie>
						)
		return 
			for $resultlist at $scoreindex in $movielist 
			let $name:=$resultlist/movie_name
			let $score:=$resultlist/score
			let $release_time:=$resultlist/release_time
		return 
			if ($scoreindex <=3 ) then 
								<tr>
								<td>{data($name)}</td>
								<td>{data($score)}</td>
								<td>{data($release_time)}</td>
								</tr>
			else
			''
	}
	
	</table>
	
	<h4>4.������Ϊ��Ԫ������������µ��ĵ�������ʾ�����Լ���Ӱ���ƣ���</h4>
							<language>
						    {
								for $lang in distinct-values(
								doc("movie.xml")/movies/movie/language/lang)
								return
								<lang name="{$lang}">
								{
								for $director in distinct-values(doc("movie.xml")/movies/movie/director)
								let $movies := doc("movie.xml")/movies/movie
								where
								some $movie in $movies
								satisfies ($movie/director = $director and $movie/language/lang =
								$lang)
								return
								<director name="{$director}">
								{
								for $aMovie in doc("movie.xml")/movies/movie
								let $aMovieDirector := $aMovie/director
								where $aMovieDirector = $director
								return
									<movie>
									{$aMovie/@*}
									{$aMovie/*}
									</movie>
								}
								</director>
								}
								</lang>
								}
							</language>
	
</body>
</html>
